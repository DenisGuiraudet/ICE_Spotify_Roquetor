import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';
import {Observable} from 'rxjs';
import {map, startWith} from 'rxjs/operators';

export interface StateGroup {
  letter: string;
  names: string[];
}

export const _filter = (opt: string[], value: string): string[] => {
  const filterValue = value.toLowerCase();

  return opt.filter(item => item.toLowerCase().indexOf(filterValue) === 0);
};

@Component({
  selector: 'app-searchbar',
  templateUrl: './searchbar.component.html',
  styleUrls: ['./searchbar.component.scss']
})
export class SearchbarComponent implements OnInit {
  
  stateForm: FormGroup = this.fb.group({
    stateGroup: '',
  });

  stateGroups: StateGroup[] = [{
    letter: 'show',
    names: ['show artist ', 'show album ', 'show track ', 'show playlist ']
  }, {
    letter: 'search',
    names: ['search artist ', 'search album ', 'search track ', 'search playlist ']
  }];

  stateGroupOptions: Observable<StateGroup[]>;

  constructor(private fb: FormBuilder) {}

  ngOnInit() {
    this.stateGroupOptions = this.stateForm.get('stateGroup')!.valueChanges
      .pipe(
        startWith(''),
        map(value => this._filterGroup(value))
      );
  }

  private _filterGroup(value: string): StateGroup[] {
    if (value) {
      return this.stateGroups
        .map(group => ({letter: group.letter, names: _filter(group.names, value)}))
        .filter(group => group.names.length > 0);
    }

    return this.stateGroups;
  }

  private cleaningRequest(request): string{
    var words = request.split(' ');
    let reqClean = "";
    reqClean = words[1] + "/";
    for(let i = 2; i < words.length; i++){
      reqClean += words[i];
      if(i != words.length-1)
      reqClean += " "
    }
    if(words[0] == "search")
    reqClean += "/only"
    return reqClean;
  }
  private search() {
    let req = this.cleaningRequest(this.stateForm.get('stateGroup').value);
    
    console.log(req);
  }

}
