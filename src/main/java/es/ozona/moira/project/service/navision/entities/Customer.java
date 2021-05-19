package es.ozona.moira.project.service.navision.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
	@Column(name = "[timestamp]")
	private Date timestamp;
	
	@Id
	@Column(name = "[No_]")
	private String no;
	
	@Column(name = "[Name]")
	private String name;
	
	@Column(name = "[Search Name]")
	private String searchName;
	
	@Column(name = "[Name 2]")
	private String name2;
	
	@Column(name = "[Address]")
	private String address;
	
	@Column(name = "[Address 2]")
	private String address2;
	
	@Column(name = "[City]")
	private String city;
	
	@Column(name = "[Phone No_]")
	private String phoneNo;
	
	@Column(name = "[Telex No_]")
	private String telexNo;
	
	@Column(name = "[Our Account No_]")
	private String ourAccountNo;
	
	@Column(name = "[Territory Code]")
	private String territoryCode;
	
	@Column(name = "[Global Dimension 1 Code]")
	private String globalDimension1Code;
	
	@Column(name = "[Global Dimension 2 Code]")
	private String globalDimension2Code;
	
	@Column(name = "[Chain Name]")
	private String chainName;
	
	@Column(name = "[Budgeted Amount]")
	private float budgetedAmount;
	
	@Column(name = "[Credit Limit (LCY)]")
	private float creditLimit;
	
	@Column(name = "[Customer Posting Group]")
	private String customerPostingGroup;
	
	@Column(name = "[Currency Code]")
	private String currencyCode;
	
	@Column(name = "[Customer Price Group]")
	private String customerPriceGroup;
	
	@Column(name = "[Language Code]")
	private String languageCode;
	
	@Column(name = "[Statistics Group]")
	private int statisticsGroup;
	
	@Column(name = "[Payment Terms Code]")
	private String paymentTermsCode;
	
	@Column(name = "[Fin_ Charge Terms Code]")
	private String finChargeTermsCode;
	
	@Column(name = "[Salesperson Code]")
	private String salespersonCode;
	
	@Column(name = "[Shipment Method Code]")
	private String shipmentMethodCode;
	
	@Column(name = "[Shipping Agent Code]")
	private String shippingAgentCode;
	
	@Column(name = "[Place of Export]")
	private String placeOfExport;
	
	@Column(name = "[Invoice Disc_ Code]")
	private String invoiceDiscCode;
	
	@Column(name = "[Customer Disc_ Code]")
	private String customerDiscCode;
	
	@Column(name = "[Country_Region Code]")
	private String countryRegionCode;
	
	@Column(name = "[Last Date Modified]")
	private Date lastDateModified;
	
	@Column(name = "[Fax No_]")
	private String faxNo;
	
	@Column(name = "[Telex Answer Back]")
	private String TelexAnswerBack;
	
	@Column(name = "[VAT Registration No_]")
	private String VATRegistrationNo;
	
	@Column(name = "[Combine Shipments]")
	private String combineShipments;
	
	@Column(name = "[Gen_ Bus_ Posting Group]")
	private String genBusPostingGroup;
	
	@Lob
	@Column(name = "[Picture]")
	private Byte[] picture;
	
	@Column(name = "[Post Code]")
	private String postCode;
	
	@Column(name = "[Country]")
	private String country;
	
	@Column(name = "[E-Mail]")
	private String email;
	
	@Column(name = "[Home Page]")
	private String homePage;
	
	@Column(name = "[Reminder Terms Code]")
	private String reminderTermsCode;
	
	@Column(name = "[No_ Series]")
	private String noSeries;
	
	@Column(name = "[Tax Area Code]")
	private String taxAreaCode;
	
	@Column(name = "[Tax Liable]")
	private int taxLiable;
	
	@Column(name = "[VAT Bus_ Posting Group]")
	private String vatBusPostingGroup;
	
	@Column(name = "[Reverse]")
	private int reverse;
	
	@Column(name = "[Block Payment Tolerance]")
	private int blockPaymentTolerance;
	
	@Column(name = "[IC Partner Code]")
	private String icPartnerCode;
	
	@Column(name = "[Prepayment _]")
	private float prepayment;
	
	@Column(name = "[Partner Type]")
	private int partnerType;
	
	@Column(name = "[Privacy Blocked]")
	private int privacyBlocked;
	
	@Column(name = "[Preferred Bank Account]")
	private String preferredBankAccount;
	
	@Column(name = "[Cash Flow Payment Terms Code]")
	private String cashFlowPaymentTermsCode;
	
	@Column(name = "[Primary Contact No_]")
	private String primaryContactNo;
	
	@Column(name = "[Responsability Center]")
	private String responsabilityCenter;
	
	@Column(name = "[Shipping Advice]")
	private int shippingAdvice;
	
	@Column(name = "[Shipping Time]")
	private String shippingTime;
	
	@Column(name = "[Shipping Agent Service Code]")
	private String shippingAgentServiceCode;
	
	@Column(name = "[Service Zone Code]")
	private String serviceZoneCode;
	
	@Column(name = "[Allow Line Disc_]")
	private int allowLineDisc;
	
	@Column(name = "[Base Calendar Code]")
	private String baseCalendarCode;
	
	@Column(name = "[Copy Sell-to Addr_ to Qte From]")
	private int copySellToAddrToQteFrom;
	
	@Column(name = "[Payment Days Code]")
	private String paymentDaysCode;
	
	@Column(name = "[Non-Paymt_ Periods Code]")
	private String nonPaymntPeriodsCode;
	
	@Column(name = "[Not in AEAT]")
	private int notInAEAT;
	
	@Column(name = "[Grupo riesgo cliente]")
	private String grupoRiesgoCliente;
	
	@Column(name = "[Omitir control CIF_NIF]")
	private int omitirControlCIFNIF;
	
	@Column(name = "[Guardado]")
	private int guardado;
	
	@Column(name = "[Venta a-No_ contacto]")
	private String ventaANoContacto;
	
	@Column(name = "[Cash VAT Customer]")
	private int cashVATCustomer;
	
	@Column(name = "[Create Receipt]")
	private int createReceipt;
	
	@Column(name = "[Grupo retenciones por B_E_]")
	private String grupoRetencionesBE;
	
	@Column(name = "[Income Tax withholding Code]")
	private String incomeTaxWithholdingCode;
	
}
