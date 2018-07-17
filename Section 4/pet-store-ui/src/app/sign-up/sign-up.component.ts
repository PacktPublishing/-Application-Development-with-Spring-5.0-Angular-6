import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';

import { AuthService } from '../auth.service';
import { first } from 'rxjs/operators';
@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  signUpForm: FormGroup;
  accountExist = false;

  constructor(
    private fb: FormBuilder,
    private auth: AuthService,
    private router: Router
  ) { }

  ngOnInit() {
    this.signUpForm = this.fb.group({
      email: ['', Validators.required],
      password: ['', Validators.required],
      name: ['', Validators.required]
    });
  }

  submitSignUpForm() {
    this.auth.register(this.signUpForm.get("email").value, 
      this.signUpForm.get("password").value, 
      this.signUpForm.get("name").value)
      .pipe(first())
      .subscribe(
        data => {
          console.log("sucess new account");
          this.router.navigateByData({
            url: ['/login'],
            data: null
          })
        }, error => {
          console.log("Error signing up");
          console.log(error);
          if (error instanceof HttpErrorResponse) {
            if (error.status === 400) {
              this.accountExist = true;
            }
          }
        }
      )
  }

}
