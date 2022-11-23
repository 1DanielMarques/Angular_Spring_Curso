import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'close'
})
export class ClosePipe implements PipeTransform {

  transform(value: string): string {
    return 'close';
  }

}
