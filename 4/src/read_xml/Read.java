package read_xml;

import java.io.File;
import javax.xml.bind.*;

import com.jaxb.generated.KONTO;
import com.jaxb.generated.RECHNUNG;
import com.jaxb.generated.RECHNUNGEN;

public class Read {
	public void unmarshall() {
		try {
			
			JAXBContext context = JAXBContext.newInstance("com.jaxb.generated");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			RECHNUNGEN rechnungen = (RECHNUNGEN) JAXBIntrospector.getValue(
			unmarshaller.unmarshal(new File("src/Rechnung_4.xml")));
			
			for (RECHNUNG rechnung: rechnungen.getRECHNUNG()) {
				System.out.println("----------------------------------------------------");
				System.out.println(rechnung.getKUNDEDATEN().getANREDE() + " " + rechnung.getKUNDEDATEN().getKUNDENNAME());
				System.out.println("Bitte zahlen Sie endlich den geforderten Betrag\nvon " + rechnung.getENTGELT().getNETTO() + " " + rechnung.getLEISTUNG().getITEM().get(0).getWAEHRUNG() + " auf das Konto");
				int count = 0;
				for (KONTO konto: rechnung.getZAHLUNGSART().getKONTO()) {
					System.out.print(konto.getKONTONR());
					count++;
					if (rechnung.getZAHLUNGSART().getKONTO().size() != count) System.out.print("\noder\n");
				}
				System.out.print(" ein.\n");
				if (rechnung.getUNTERNEHMENDANTEN().getTELEFONNUMMER1() !=  null) {
					System.out.print("Falls Sie trotzdem noch unverschämt genug sind\nund Fragen haben, dann können Sie mich jederzeit\nunter ");
					System.out.print(rechnung.getUNTERNEHMENDANTEN().getTELEFONNUMMER1()+" erreichen.\n");
				}
				System.out.println("Hochachtungsvoll");
				System.out.println(rechnung.getUNTERNEHMENDANTEN().getUNTERNEHMENSNAME());
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
