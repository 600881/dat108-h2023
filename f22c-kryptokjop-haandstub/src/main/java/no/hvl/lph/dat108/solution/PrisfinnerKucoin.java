package no.hvl.lph.dat108.solution;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;

import com.kucoin.sdk.KucoinClientBuilder;
import com.kucoin.sdk.KucoinRestClient;

public class PrisfinnerKucoin implements Prisfinner {

	@Override
	public Map<String, BigDecimal> finnPris(String fiatCode, String kryptoCode) throws IOException {
		
		KucoinRestClient kucoinRestklient = new KucoinClientBuilder()
				.withBaseUrl("https://openapi-v2.kucoin.com").buildRestClient();

		return kucoinRestklient.currencyAPI().getFiatPrice(fiatCode, kryptoCode);
	}
}
