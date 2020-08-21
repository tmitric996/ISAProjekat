import { User } from './user';

export class Adminklinike extends User {
    
    ime: string;
    prezime: string;
    klinikaKojuOdrzava: string;
    prvoLogovanje: boolean;
    telefon: string;
}
