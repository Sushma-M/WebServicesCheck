/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

package com.webservicescheck.services.countryinfoservice1.services;
import com.webservicescheck.services.countryinfoservice1.*;
import java.util.List;

import com.wavemaker.runtime.soap.util.SoapSettingsResolver;
import com.wavemaker.runtime.soap.SoapServiceSettings;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.xml.ws.BindingProvider;



@Service
public class CountryInfoService1Service{

    @Autowired
    @Qualifier("CountryInfoService1SoapServiceSettings")
    private SoapServiceSettings soapServiceSettings;


	public ListOfCountryNamesGroupedByContinentResponse listOfCountryNamesGroupedByContinent(  com.webservicescheck.services.countryinfoservice1.ListOfCountryNamesGroupedByContinent parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesGroupedByContinent(parameters );
	}

	public CountryFlagResponse countryFlag(  com.webservicescheck.services.countryinfoservice1.CountryFlag parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryFlag(parameters );
	}

	public ListOfCountryNamesByNameResponse listOfCountryNamesByName(  com.webservicescheck.services.countryinfoservice1.ListOfCountryNamesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesByName(parameters );
	}

	public CountryNameResponse countryName(  com.webservicescheck.services.countryinfoservice1.CountryName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryName(parameters );
	}

	public LanguageISOCodeResponse languageISOCode(  com.webservicescheck.services.countryinfoservice1.LanguageISOCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.languageISOCode(parameters );
	}

	public CountryCurrencyResponse countryCurrency(  com.webservicescheck.services.countryinfoservice1.CountryCurrency parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryCurrency(parameters );
	}

	public CurrencyNameResponse currencyName(  com.webservicescheck.services.countryinfoservice1.CurrencyName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.currencyName(parameters );
	}

	public ListOfLanguagesByNameResponse listOfLanguagesByName(  com.webservicescheck.services.countryinfoservice1.ListOfLanguagesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfLanguagesByName(parameters );
	}

	public FullCountryInfoAllCountriesResponse fullCountryInfoAllCountries(  com.webservicescheck.services.countryinfoservice1.FullCountryInfoAllCountries parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.fullCountryInfoAllCountries(parameters );
	}

	public ListOfCountryNamesByCodeResponse listOfCountryNamesByCode(  com.webservicescheck.services.countryinfoservice1.ListOfCountryNamesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCountryNamesByCode(parameters );
	}

	public ListOfCurrenciesByNameResponse listOfCurrenciesByName(  com.webservicescheck.services.countryinfoservice1.ListOfCurrenciesByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCurrenciesByName(parameters );
	}

	public FullCountryInfoResponse fullCountryInfo(  com.webservicescheck.services.countryinfoservice1.FullCountryInfo parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.fullCountryInfo(parameters );
	}

	public ListOfContinentsByCodeResponse listOfContinentsByCode(  com.webservicescheck.services.countryinfoservice1.ListOfContinentsByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfContinentsByCode(parameters );
	}

	public ListOfCurrenciesByCodeResponse listOfCurrenciesByCode(  com.webservicescheck.services.countryinfoservice1.ListOfCurrenciesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfCurrenciesByCode(parameters );
	}

	public LanguageNameResponse languageName(  com.webservicescheck.services.countryinfoservice1.LanguageName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.languageName(parameters );
	}

	public CountryISOCodeResponse countryISOCode(  com.webservicescheck.services.countryinfoservice1.CountryISOCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryISOCode(parameters );
	}

	public ListOfContinentsByNameResponse listOfContinentsByName(  com.webservicescheck.services.countryinfoservice1.ListOfContinentsByName parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfContinentsByName(parameters );
	}

	public CountryIntPhoneCodeResponse countryIntPhoneCode(  com.webservicescheck.services.countryinfoservice1.CountryIntPhoneCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countryIntPhoneCode(parameters );
	}

	public ListOfLanguagesByCodeResponse listOfLanguagesByCode(  com.webservicescheck.services.countryinfoservice1.ListOfLanguagesByCode parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.listOfLanguagesByCode(parameters );
	}

	public CountriesUsingCurrencyResponse countriesUsingCurrency(  com.webservicescheck.services.countryinfoservice1.CountriesUsingCurrency parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.countriesUsingCurrency(parameters );
	}

	public CapitalCityResponse capitalCity(  com.webservicescheck.services.countryinfoservice1.CapitalCity parameters )
	          {
 	    CountryInfoService countryinfoservice = new CountryInfoService();
 CountryInfoServiceSoapType countryinfoservicesoaptype = countryinfoservice.getCountryInfoServiceSoap();
 SoapSettingsResolver.setBindingProperties((BindingProvider)countryinfoservicesoaptype, soapServiceSettings);
 return countryinfoservicesoaptype.capitalCity(parameters );
	}
}
