package rmiService;

import metier.Compte;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {
    public BanqueImpl() throws RemoteException {
        super();
    }

    public String creerCompte(Compte c) throws RemoteException {
        
        return "Implémentation de creerCompte à ajouter ici";
    }

    @Override
    public String getInfoCompte(int code) throws RemoteException {
        
        return "Implémentation de getInfoCompte à ajouter ici";
    }
}
