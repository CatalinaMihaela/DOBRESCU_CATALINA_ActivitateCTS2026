package decorator.model;
//Agențiade turism dorește să ofere pentru o perioadă de trei luni
//posibilitatea de anulare a pachetelor rezervate. Această ofertă expiră în
//trei luni. Managerul agenției nu dorește să modifice codul, deoarece
//după trei luni trebuie să modifice iar codul sursă.
//Să se implementeze modulul care asigură oferta agenției fără a se
//modifica codul existent

public interface IPachet {
    void vindePachet();

}
