package Adapters;

import java.rmi.RemoteException; 
import Abstract.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy kpsp = new KPSPublicSoapProxy();
		try {
			return  kpsp.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()) , gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(), gamer.getDateOfBirth());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return true;
		
	}

}
