import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from './app-material/app-material.module';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import { CategoryPipe } from './pipes/category.pipe';
import { ClosePipe } from './pipes/close.pipe';

@NgModule({
  declarations: [ErrorDialogComponent, CategoryPipe, ClosePipe],
  imports: [CommonModule, AppMaterialModule],
  exports: [ErrorDialogComponent,CategoryPipe],
})
export class SharedModule {}
