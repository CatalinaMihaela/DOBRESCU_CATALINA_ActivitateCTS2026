package composite.classes;


public interface ISpital {


    void adaugaNod(ISpital spital) throws Exception;
    void getNod(int index) throws Exception;
    void stergeNod(ISpital spital) throws Exception;
    void descriere(String indent);



}