import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EducationComponent } from './Component/education/education.component';
import { ExpierenceComponent } from './Component/expierence/expierence.component';
import { HobbiesComponent } from './Component/hobbies/hobbies.component';
import { MainComponent } from './Component/main/main.component';
import { SkillComponent } from './Component/skill/skill.component';

const routes: Routes = [
  { path: '', component: MainComponent},
  { path: 'education', component: EducationComponent},
  { path: 'experience', component: ExpierenceComponent},
  { path: 'skill', component: SkillComponent},
  { path: 'hobbies', component: HobbiesComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
