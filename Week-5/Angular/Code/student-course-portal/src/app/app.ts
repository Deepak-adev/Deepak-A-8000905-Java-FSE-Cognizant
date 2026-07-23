import { Component } from '@angular/core';
import { Header } from './pages/components/header/header';
import { HomeComponent } from './pages/home/home';

@Component({
  selector: 'app-root',
  imports: [Header, HomeComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {}