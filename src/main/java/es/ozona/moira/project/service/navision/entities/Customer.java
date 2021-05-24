package es.ozona.moira.project.service.navision.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "[OZONA CONSULTING, S_L_$Customer]", schema="[dbo]")
public class Customer {
	@Id
	@Column(name = "[timestamp]")
	private byte[] timestamp;
	

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
	
	@Column(name = "[Contact]")
	private String contact;
	
	@Column(name = "[Phone No_]")
	private String phoneNo;//10
	
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
	private String currencyCode;//20
	
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
	private String invoiceDiscCode;//30
	
	@Column(name = "[Customer Disc_ Group]")
	private String customerDiscGroup;
	
	@Column(name = "[Country_Region Code]")
	private String countryRegionCode;//
	
	@Column(name = "[Collection Method]")
	private String collectionMethod;
	
	@Column(name = "[Amount]")
	private float amount;
	
	@Column(name = "[Blocked]")
	private int blocked;
	
	@Column(name = "[Invoice Copies]")
	private int invoiceCopies;
	
	@Column(name = "[Last Statement No_]")
	private int lastStatementNo;
	
	@Column(name = "[Print Statements]")
	private int printStatements;
	
	@Column(name = "[Bill-to Customer No_]")
	private String billToCustomerNo;
	
	@Column(name = "[Priority]")
	private int priority;//40
	
	@Column(name = "[Payment Method Code]")
	private String paymentMethodCode;
	
	@Column(name = "[Last Date Modified]")
	private Date lastDateModified;
	
	@Column(name = "[Application Method]")
	private int applicationMethod;
	
	@Column(name = "[Prices Including VAT]")
	private int pricesIncludingVAT;
	
	@Column(name = "[Location Code]")
	private String locationCode;
	
	@Column(name = "[Fax No_]")
	private String faxNo;
	
	@Column(name = "[Telex Answer Back]")
	private String TelexAnswerBack;
	
	@Column(name = "[VAT Registration No_]")
	private String VATRegistrationNo;
	
	@Column(name = "[Combine Shipments]")
	private String combineShipments;
	
	@Column(name = "[Gen_ Bus_ Posting Group]")
	private String genBusPostingGroup;//50
	
	@Lob
	@Column(name = "[Picture]")
	private Byte[] picture;
	
	@Column(name = "[Post Code]")
	private String postCode;
	
	@Column(name = "[County]")
	private String county;
	
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
	private String vatBusPostingGroup;//60
	
	@Column(name = "[Reserve]")
	private int reserve;
	
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
	
	@Column(name = "[Responsibility Center]")
	private String responsibilityCenter;//70
	
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
	private int notInAEAT;//80
	
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
	private String incomeTaxWithholdingCode;//88

	public Customer() {
		super();
	}

	public Customer(String name, String searchName, String name2, String address, String address2, String city,
			String contact, String phoneNo, String telexNo, String ourAccountNo, String territoryCode,
			String globalDimension1Code, String globalDimension2Code, String chainName, float budgetedAmount,
			float creditLimit, String customerPostingGroup, String currencyCode, String customerPriceGroup,
			String languageCode, int statisticsGroup, String paymentTermsCode, String finChargeTermsCode,
			String salespersonCode, String shipmentMethodCode, String shippingAgentCode, String placeOfExport,
			String invoiceDiscCode, String customerDiscGroup, String countryRegionCode, String collectionMethod,
			float amount, int blocked, int invoiceCopies, int lastStatementNo, int printStatements,
			String billToCustomerNo, int priority, String paymentMethodCode, Date lastDateModified,
			int applicationMethod, int pricesIncludingVAT, String locationCode, String faxNo, String telexAnswerBack,
			String vATRegistrationNo, String combineShipments, String genBusPostingGroup, Byte[] picture,
			String postCode, String county, String email, String homePage, String reminderTermsCode, String noSeries,
			String taxAreaCode, int taxLiable, String vatBusPostingGroup, int reserve, int blockPaymentTolerance,
			String icPartnerCode, float prepayment, int partnerType, int privacyBlocked, String preferredBankAccount,
			String cashFlowPaymentTermsCode, String primaryContactNo, String responsibilityCenter, int shippingAdvice,
			String shippingTime, String shippingAgentServiceCode, String serviceZoneCode, int allowLineDisc,
			String baseCalendarCode, int copySellToAddrToQteFrom, String paymentDaysCode, String nonPaymntPeriodsCode,
			int notInAEAT, String grupoRiesgoCliente, int omitirControlCIFNIF, int guardado, String ventaANoContacto,
			int cashVATCustomer, int createReceipt, String grupoRetencionesBE, String incomeTaxWithholdingCode) {
		super();
		this.name = name;
		this.searchName = searchName;
		this.name2 = name2;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.contact = contact;
		this.phoneNo = phoneNo;
		this.telexNo = telexNo;
		this.ourAccountNo = ourAccountNo;
		this.territoryCode = territoryCode;
		this.globalDimension1Code = globalDimension1Code;
		this.globalDimension2Code = globalDimension2Code;
		this.chainName = chainName;
		this.budgetedAmount = budgetedAmount;
		this.creditLimit = creditLimit;
		this.customerPostingGroup = customerPostingGroup;
		this.currencyCode = currencyCode;
		this.customerPriceGroup = customerPriceGroup;
		this.languageCode = languageCode;
		this.statisticsGroup = statisticsGroup;
		this.paymentTermsCode = paymentTermsCode;
		this.finChargeTermsCode = finChargeTermsCode;
		this.salespersonCode = salespersonCode;
		this.shipmentMethodCode = shipmentMethodCode;
		this.shippingAgentCode = shippingAgentCode;
		this.placeOfExport = placeOfExport;
		this.invoiceDiscCode = invoiceDiscCode;
		this.customerDiscGroup = customerDiscGroup;
		this.countryRegionCode = countryRegionCode;
		this.collectionMethod = collectionMethod;
		this.amount = amount;
		this.blocked = blocked;
		this.invoiceCopies = invoiceCopies;
		this.lastStatementNo = lastStatementNo;
		this.printStatements = printStatements;
		this.billToCustomerNo = billToCustomerNo;
		this.priority = priority;
		this.paymentMethodCode = paymentMethodCode;
		this.lastDateModified = lastDateModified;
		this.applicationMethod = applicationMethod;
		this.pricesIncludingVAT = pricesIncludingVAT;
		this.locationCode = locationCode;
		this.faxNo = faxNo;
		TelexAnswerBack = telexAnswerBack;
		VATRegistrationNo = vATRegistrationNo;
		this.combineShipments = combineShipments;
		this.genBusPostingGroup = genBusPostingGroup;
		this.picture = picture;
		this.postCode = postCode;
		this.county = county;
		this.email = email;
		this.homePage = homePage;
		this.reminderTermsCode = reminderTermsCode;
		this.noSeries = noSeries;
		this.taxAreaCode = taxAreaCode;
		this.taxLiable = taxLiable;
		this.vatBusPostingGroup = vatBusPostingGroup;
		this.reserve = reserve;
		this.blockPaymentTolerance = blockPaymentTolerance;
		this.icPartnerCode = icPartnerCode;
		this.prepayment = prepayment;
		this.partnerType = partnerType;
		this.privacyBlocked = privacyBlocked;
		this.preferredBankAccount = preferredBankAccount;
		this.cashFlowPaymentTermsCode = cashFlowPaymentTermsCode;
		this.primaryContactNo = primaryContactNo;
		this.responsibilityCenter = responsibilityCenter;
		this.shippingAdvice = shippingAdvice;
		this.shippingTime = shippingTime;
		this.shippingAgentServiceCode = shippingAgentServiceCode;
		this.serviceZoneCode = serviceZoneCode;
		this.allowLineDisc = allowLineDisc;
		this.baseCalendarCode = baseCalendarCode;
		this.copySellToAddrToQteFrom = copySellToAddrToQteFrom;
		this.paymentDaysCode = paymentDaysCode;
		this.nonPaymntPeriodsCode = nonPaymntPeriodsCode;
		this.notInAEAT = notInAEAT;
		this.grupoRiesgoCliente = grupoRiesgoCliente;
		this.omitirControlCIFNIF = omitirControlCIFNIF;
		this.guardado = guardado;
		this.ventaANoContacto = ventaANoContacto;
		this.cashVATCustomer = cashVATCustomer;
		this.createReceipt = createReceipt;
		this.grupoRetencionesBE = grupoRetencionesBE;
		this.incomeTaxWithholdingCode = incomeTaxWithholdingCode;
	}

	public Customer(byte[] timestamp, String no) {
		super();
		this.timestamp = timestamp;
		this.no = no;
	}

	public byte[] getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(byte[] timestamp) {
		this.timestamp = timestamp;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getTelexNo() {
		return telexNo;
	}

	public void setTelexNo(String telexNo) {
		this.telexNo = telexNo;
	}

	public String getOurAccountNo() {
		return ourAccountNo;
	}

	public void setOurAccountNo(String ourAccountNo) {
		this.ourAccountNo = ourAccountNo;
	}

	public String getTerritoryCode() {
		return territoryCode;
	}

	public void setTerritoryCode(String territoryCode) {
		this.territoryCode = territoryCode;
	}

	public String getGlobalDimension1Code() {
		return globalDimension1Code;
	}

	public void setGlobalDimension1Code(String globalDimension1Code) {
		this.globalDimension1Code = globalDimension1Code;
	}

	public String getGlobalDimension2Code() {
		return globalDimension2Code;
	}

	public void setGlobalDimension2Code(String globalDimension2Code) {
		this.globalDimension2Code = globalDimension2Code;
	}

	public String getChainName() {
		return chainName;
	}

	public void setChainName(String chainName) {
		this.chainName = chainName;
	}

	public float getBudgetedAmount() {
		return budgetedAmount;
	}

	public void setBudgetedAmount(float budgetedAmount) {
		this.budgetedAmount = budgetedAmount;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getCustomerPostingGroup() {
		return customerPostingGroup;
	}

	public void setCustomerPostingGroup(String customerPostingGroup) {
		this.customerPostingGroup = customerPostingGroup;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCustomerPriceGroup() {
		return customerPriceGroup;
	}

	public void setCustomerPriceGroup(String customerPriceGroup) {
		this.customerPriceGroup = customerPriceGroup;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public int getStatisticsGroup() {
		return statisticsGroup;
	}

	public void setStatisticsGroup(int statisticsGroup) {
		this.statisticsGroup = statisticsGroup;
	}

	public String getPaymentTermsCode() {
		return paymentTermsCode;
	}

	public void setPaymentTermsCode(String paymentTermsCode) {
		this.paymentTermsCode = paymentTermsCode;
	}

	public String getFinChargeTermsCode() {
		return finChargeTermsCode;
	}

	public void setFinChargeTermsCode(String finChargeTermsCode) {
		this.finChargeTermsCode = finChargeTermsCode;
	}

	public String getSalespersonCode() {
		return salespersonCode;
	}

	public void setSalespersonCode(String salespersonCode) {
		this.salespersonCode = salespersonCode;
	}

	public String getShipmentMethodCode() {
		return shipmentMethodCode;
	}

	public void setShipmentMethodCode(String shipmentMethodCode) {
		this.shipmentMethodCode = shipmentMethodCode;
	}

	public String getShippingAgentCode() {
		return shippingAgentCode;
	}

	public void setShippingAgentCode(String shippingAgentCode) {
		this.shippingAgentCode = shippingAgentCode;
	}

	public String getPlaceOfExport() {
		return placeOfExport;
	}

	public void setPlaceOfExport(String placeOfExport) {
		this.placeOfExport = placeOfExport;
	}

	public String getInvoiceDiscCode() {
		return invoiceDiscCode;
	}

	public void setInvoiceDiscCode(String invoiceDiscCode) {
		this.invoiceDiscCode = invoiceDiscCode;
	}

	public String getCustomerDiscGroup() {
		return customerDiscGroup;
	}

	public void setCustomerDiscGroup(String customerDiscGroup) {
		this.customerDiscGroup = customerDiscGroup;
	}

	public String getCountryRegionCode() {
		return countryRegionCode;
	}

	public void setCountryRegionCode(String countryRegionCode) {
		this.countryRegionCode = countryRegionCode;
	}

	public String getCollectionMethod() {
		return collectionMethod;
	}

	public void setCollectionMethod(String collectionMethod) {
		this.collectionMethod = collectionMethod;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getBlocked() {
		return blocked;
	}

	public void setBlocked(int blocked) {
		this.blocked = blocked;
	}

	public int getInvoiceCopies() {
		return invoiceCopies;
	}

	public void setInvoiceCopies(int invoiceCopies) {
		this.invoiceCopies = invoiceCopies;
	}

	public int getLastStatementNo() {
		return lastStatementNo;
	}

	public void setLastStatementNo(int lastStatementNo) {
		this.lastStatementNo = lastStatementNo;
	}

	public int getPrintStatements() {
		return printStatements;
	}

	public void setPrintStatements(int printStatements) {
		this.printStatements = printStatements;
	}

	public String getBillToCustomerNo() {
		return billToCustomerNo;
	}

	public void setBillToCustomerNo(String billToCustomerNo) {
		this.billToCustomerNo = billToCustomerNo;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getPaymentMethodCode() {
		return paymentMethodCode;
	}

	public void setPaymentMethodCode(String paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	public Date getLastDateModified() {
		return lastDateModified;
	}

	public void setLastDateModified(Date lastDateModified) {
		this.lastDateModified = lastDateModified;
	}

	public int getApplicationMethod() {
		return applicationMethod;
	}

	public void setApplicationMethod(int applicationMethod) {
		this.applicationMethod = applicationMethod;
	}

	public int getPricesIncludingVAT() {
		return pricesIncludingVAT;
	}

	public void setPricesIncludingVAT(int pricesIncludingVAT) {
		this.pricesIncludingVAT = pricesIncludingVAT;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getTelexAnswerBack() {
		return TelexAnswerBack;
	}

	public void setTelexAnswerBack(String telexAnswerBack) {
		TelexAnswerBack = telexAnswerBack;
	}

	public String getVATRegistrationNo() {
		return VATRegistrationNo;
	}

	public void setVATRegistrationNo(String vATRegistrationNo) {
		VATRegistrationNo = vATRegistrationNo;
	}

	public String getCombineShipments() {
		return combineShipments;
	}

	public void setCombineShipments(String combineShipments) {
		this.combineShipments = combineShipments;
	}

	public String getGenBusPostingGroup() {
		return genBusPostingGroup;
	}

	public void setGenBusPostingGroup(String genBusPostingGroup) {
		this.genBusPostingGroup = genBusPostingGroup;
	}

	public Byte[] getPicture() {
		return picture;
	}

	public void setPicture(Byte[] picture) {
		this.picture = picture;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHomePage() {
		return homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}

	public String getReminderTermsCode() {
		return reminderTermsCode;
	}

	public void setReminderTermsCode(String reminderTermsCode) {
		this.reminderTermsCode = reminderTermsCode;
	}

	public String getNoSeries() {
		return noSeries;
	}

	public void setNoSeries(String noSeries) {
		this.noSeries = noSeries;
	}

	public String getTaxAreaCode() {
		return taxAreaCode;
	}

	public void setTaxAreaCode(String taxAreaCode) {
		this.taxAreaCode = taxAreaCode;
	}

	public int getTaxLiable() {
		return taxLiable;
	}

	public void setTaxLiable(int taxLiable) {
		this.taxLiable = taxLiable;
	}

	public String getVatBusPostingGroup() {
		return vatBusPostingGroup;
	}

	public void setVatBusPostingGroup(String vatBusPostingGroup) {
		this.vatBusPostingGroup = vatBusPostingGroup;
	}

	public int getReserve() {
		return reserve;
	}

	public void setReserve(int reserve) {
		this.reserve = reserve;
	}

	public int getBlockPaymentTolerance() {
		return blockPaymentTolerance;
	}

	public void setBlockPaymentTolerance(int blockPaymentTolerance) {
		this.blockPaymentTolerance = blockPaymentTolerance;
	}

	public String getIcPartnerCode() {
		return icPartnerCode;
	}

	public void setIcPartnerCode(String icPartnerCode) {
		this.icPartnerCode = icPartnerCode;
	}

	public float getPrepayment() {
		return prepayment;
	}

	public void setPrepayment(float prepayment) {
		this.prepayment = prepayment;
	}

	public int getPartnerType() {
		return partnerType;
	}

	public void setPartnerType(int partnerType) {
		this.partnerType = partnerType;
	}

	public int getPrivacyBlocked() {
		return privacyBlocked;
	}

	public void setPrivacyBlocked(int privacyBlocked) {
		this.privacyBlocked = privacyBlocked;
	}

	public String getPreferredBankAccount() {
		return preferredBankAccount;
	}

	public void setPreferredBankAccount(String preferredBankAccount) {
		this.preferredBankAccount = preferredBankAccount;
	}

	public String getCashFlowPaymentTermsCode() {
		return cashFlowPaymentTermsCode;
	}

	public void setCashFlowPaymentTermsCode(String cashFlowPaymentTermsCode) {
		this.cashFlowPaymentTermsCode = cashFlowPaymentTermsCode;
	}

	public String getPrimaryContactNo() {
		return primaryContactNo;
	}

	public void setPrimaryContactNo(String primaryContactNo) {
		this.primaryContactNo = primaryContactNo;
	}

	public String getResponsibilityCenter() {
		return responsibilityCenter;
	}

	public void setResponsibilityCenter(String responsibilityCenter) {
		this.responsibilityCenter = responsibilityCenter;
	}

	public int getShippingAdvice() {
		return shippingAdvice;
	}

	public void setShippingAdvice(int shippingAdvice) {
		this.shippingAdvice = shippingAdvice;
	}

	public String getShippingTime() {
		return shippingTime;
	}

	public void setShippingTime(String shippingTime) {
		this.shippingTime = shippingTime;
	}

	public String getShippingAgentServiceCode() {
		return shippingAgentServiceCode;
	}

	public void setShippingAgentServiceCode(String shippingAgentServiceCode) {
		this.shippingAgentServiceCode = shippingAgentServiceCode;
	}

	public String getServiceZoneCode() {
		return serviceZoneCode;
	}

	public void setServiceZoneCode(String serviceZoneCode) {
		this.serviceZoneCode = serviceZoneCode;
	}

	public int getAllowLineDisc() {
		return allowLineDisc;
	}

	public void setAllowLineDisc(int allowLineDisc) {
		this.allowLineDisc = allowLineDisc;
	}

	public String getBaseCalendarCode() {
		return baseCalendarCode;
	}

	public void setBaseCalendarCode(String baseCalendarCode) {
		this.baseCalendarCode = baseCalendarCode;
	}

	public int getCopySellToAddrToQteFrom() {
		return copySellToAddrToQteFrom;
	}

	public void setCopySellToAddrToQteFrom(int copySellToAddrToQteFrom) {
		this.copySellToAddrToQteFrom = copySellToAddrToQteFrom;
	}

	public String getPaymentDaysCode() {
		return paymentDaysCode;
	}

	public void setPaymentDaysCode(String paymentDaysCode) {
		this.paymentDaysCode = paymentDaysCode;
	}

	public String getNonPaymntPeriodsCode() {
		return nonPaymntPeriodsCode;
	}

	public void setNonPaymntPeriodsCode(String nonPaymntPeriodsCode) {
		this.nonPaymntPeriodsCode = nonPaymntPeriodsCode;
	}

	public int getNotInAEAT() {
		return notInAEAT;
	}

	public void setNotInAEAT(int notInAEAT) {
		this.notInAEAT = notInAEAT;
	}

	public String getGrupoRiesgoCliente() {
		return grupoRiesgoCliente;
	}

	public void setGrupoRiesgoCliente(String grupoRiesgoCliente) {
		this.grupoRiesgoCliente = grupoRiesgoCliente;
	}

	public int getOmitirControlCIFNIF() {
		return omitirControlCIFNIF;
	}

	public void setOmitirControlCIFNIF(int omitirControlCIFNIF) {
		this.omitirControlCIFNIF = omitirControlCIFNIF;
	}

	public int getGuardado() {
		return guardado;
	}

	public void setGuardado(int guardado) {
		this.guardado = guardado;
	}

	public String getVentaANoContacto() {
		return ventaANoContacto;
	}

	public void setVentaANoContacto(String ventaANoContacto) {
		this.ventaANoContacto = ventaANoContacto;
	}

	public int getCashVATCustomer() {
		return cashVATCustomer;
	}

	public void setCashVATCustomer(int cashVATCustomer) {
		this.cashVATCustomer = cashVATCustomer;
	}

	public int getCreateReceipt() {
		return createReceipt;
	}

	public void setCreateReceipt(int createReceipt) {
		this.createReceipt = createReceipt;
	}

	public String getGrupoRetencionesBE() {
		return grupoRetencionesBE;
	}

	public void setGrupoRetencionesBE(String grupoRetencionesBE) {
		this.grupoRetencionesBE = grupoRetencionesBE;
	}

	public String getIncomeTaxWithholdingCode() {
		return incomeTaxWithholdingCode;
	}

	public void setIncomeTaxWithholdingCode(String incomeTaxWithholdingCode) {
		this.incomeTaxWithholdingCode = incomeTaxWithholdingCode;
	}
	
}
