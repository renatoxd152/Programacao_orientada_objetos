import data.*;
import model.Candidato;
import model.Cargo;
import model.Partido;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Partido partido1 = new Partido(3, "Partido Liberal", "PL");
        Partido partido2 = new Partido(4, "Partido dos Trabalhadores", "PT");

        PartidoDAO partidoDAO = new PartidoSQliteDAO();
        partidoDAO.salvar(partido1);
        partidoDAO.salvar(partido2);

        Cargo cargo1 = new Cargo(3, "Presidente");
        Cargo cargo2 = new Cargo(4, "Governador");

        CargoDAO cargoDAO = new CargoSQliteDAO();
        cargoDAO.salvar(cargo1);
        cargoDAO.salvar(cargo2);

        Candidato candidato1 = new Candidato(3, "José Fernando", cargo1, partido1);
        Candidato candidato2 = new Candidato(4, "José Dirceu", cargo2, partido2);

        CandidatoDAO candidatoDAO = new CandidatoSQliteDAO();
        candidatoDAO.salvar(candidato1);
        candidatoDAO.salvar(candidato2);

        System.out.println("\nPartidos:");
        List<Partido> listaPartido = partidoDAO.buscarTodos();
        for (Partido p : listaPartido) {
            p.mostrarDados();
        }

        System.out.println("\nCargos:");
        List<Cargo> listaCargo = cargoDAO.buscarTodos();
        for (Cargo c :listaCargo)
        {
            c.mostrarDados();
        }

        System.out.println("\nCandidatos:");
        List<Candidato> listaCandidatos = candidatoDAO.buscarTodos();
        for (Candidato c : listaCandidatos)
        {
            c.mostrarDados();
        }
    }
}
