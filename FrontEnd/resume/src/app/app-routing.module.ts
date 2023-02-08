import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EducationComponent } from './Component/education/education.component';
import { MainComponent } from './Component/main/main.component';

const routes: Routes = [
  { path: '', component: MainComponent},
  { path: 'education', component: EducationComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
