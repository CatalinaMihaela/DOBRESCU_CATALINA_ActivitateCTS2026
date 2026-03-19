package spital.FactoryMethod.classes;
//3. În cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic.
//Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor
//PersonalSpital. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de personal să
//nu fie necesare modificări în codul existent.

public interface IFactory {
    PersonalSpital create(String nume, int varsta, int anivechime);
}
