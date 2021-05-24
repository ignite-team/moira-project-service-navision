package es.ozona.moira.project.service.navision.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "[OZONA CONSULTING, S_L_$Contact]", schema="[dbo]")
public class Contact {
	@Column(name = "[timestamp]")
	private byte[] timestamp;
	
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
	
	@Column(name = "[Territory Code]")
	private String territoryCode;
	
	@Column(name = "[Currency Code]")
	private String currencyCode;
	
	@Column(name = "[Language Code]")
	private String languageCode;
	
	@Column(name = "[Salesperson Code]")
	private String salespersonCode;
	
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
	
	@Column(name = "[No_ Series]")
	private String noSeries;
	
	@Column(name = "[Privacy Blocked]")
	private int privacyBlocked;
	
	@Column(name = "[Minor]")
	private int minor;
	
	@Column(name = "[Parental Consent Received]")
	private int parentalConsentReceived;
	
	@Column(name = "[Type]")
	private int type;
	
	@Column(name = "[Company No_]")
	private String companyNo;
	
	@Column(name = "[Company Name]")
	private String companyName;
	
	@Column(name = "[Lookup Contact No_]")
	private String lookupContactNo;
	
	@Column(name = "[First Name]")
	private String firstName;
	
	@Column(name = "[Middle Name]")
	private String middleName;
	
	@Column(name = "[Surname]")
	private String surname;
	
	@Column(name = "[Job Title]")
	private String jobTitle;
	
	@Column(name = "[Initials]")
	private String initials;
	
	@Column(name = "[Extension No_]")
	private String extensionNo;
	
	@Column(name = "[Mobile Phone No_]")
	private String mobilePhoneNo;
	
	@Column(name = "[Pager]")
	private String pager;
	
	@Column(name = "[Organizational Level Code]")
	private String organizationalLevelCode;
	
	@Column(name = "[Exclude from Segment]")
	private int excludeFromSegment;
	
	@Column(name = "[External ID]")
	private String externalId;
	
	@Column(name = "[Correspondence Type]")
	private int correspondenceType;
	
	@Column(name = "[Salutation Code]")
	private String salutationCode;
	
	@Column(name = "[Search E-Mail]")
	private String searchEmail;
	
	@Column(name = "[Last Time Modified]")
	private Date lastTimeModified;
	
	@Column(name = "[E-Mail 2]")
	private String email2;
	
	public Contact() {
		super();
	}

	public Contact(String name, String searchName, String name2, String address, String address2, String city,
			String phoneNo, String telexNo, String territoryCode, String currencyCode, String languageCode,
			String salespersonCode, String countryRegionCode, Date lastDateModified, String faxNo,
			String telexAnswerBack, String vATRegistrationNo, Byte[] picture, String postCode, String county,
			String email, String homePage, String noSeries, int privacyBlocked, int minor, int parentalConsentReceived,
			int type, String companyNo, String companyName, String lookupContactNo, String firstName, String middleName,
			String surname, String jobTitle, String initials, String extensionNo, String mobilePhoneNo, String pager,
			String organizationalLevelCode, int excludeFromSegment, String externalId, int correspondenceType,
			String salutationCode, String searchEmail, Date lastTimeModified, String email2) {
		super();
		this.name = name;
		this.searchName = searchName;
		this.name2 = name2;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.phoneNo = phoneNo;
		this.telexNo = telexNo;
		this.territoryCode = territoryCode;
		this.currencyCode = currencyCode;
		this.languageCode = languageCode;
		this.salespersonCode = salespersonCode;
		this.countryRegionCode = countryRegionCode;
		this.lastDateModified = lastDateModified;
		this.faxNo = faxNo;
		TelexAnswerBack = telexAnswerBack;
		VATRegistrationNo = vATRegistrationNo;
		this.picture = picture;
		this.postCode = postCode;
		this.county = county;
		this.email = email;
		this.homePage = homePage;
		this.noSeries = noSeries;
		this.privacyBlocked = privacyBlocked;
		this.minor = minor;
		this.parentalConsentReceived = parentalConsentReceived;
		this.type = type;
		this.companyNo = companyNo;
		this.companyName = companyName;
		this.lookupContactNo = lookupContactNo;
		this.firstName = firstName;
		this.middleName = middleName;
		this.surname = surname;
		this.jobTitle = jobTitle;
		this.initials = initials;
		this.extensionNo = extensionNo;
		this.mobilePhoneNo = mobilePhoneNo;
		this.pager = pager;
		this.organizationalLevelCode = organizationalLevelCode;
		this.excludeFromSegment = excludeFromSegment;
		this.externalId = externalId;
		this.correspondenceType = correspondenceType;
		this.salutationCode = salutationCode;
		this.searchEmail = searchEmail;
		this.lastTimeModified = lastTimeModified;
		this.email2 = email2;
	}

	public Contact(String no) {
		super();
		this.no = no;
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

	public String getTerritoryCode() {
		return territoryCode;
	}

	public void setTerritoryCode(String territoryCode) {
		this.territoryCode = territoryCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getSalespersonCode() {
		return salespersonCode;
	}

	public void setSalespersonCode(String salespersonCode) {
		this.salespersonCode = salespersonCode;
	}

	public String getCountryRegionCode() {
		return countryRegionCode;
	}

	public void setCountryRegionCode(String countryRegionCode) {
		this.countryRegionCode = countryRegionCode;
	}

	public Date getLastDateModified() {
		return lastDateModified;
	}

	public void setLastDateModified(Date lastDateModified) {
		this.lastDateModified = lastDateModified;
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

	public String getNoSeries() {
		return noSeries;
	}

	public void setNoSeries(String noSeries) {
		this.noSeries = noSeries;
	}

	public int getPrivacyBlocked() {
		return privacyBlocked;
	}

	public void setPrivacyBlocked(int privacyBlocked) {
		this.privacyBlocked = privacyBlocked;
	}

	public int getMinor() {
		return minor;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public int getParentalConsentReceived() {
		return parentalConsentReceived;
	}

	public void setParentalConsentReceived(int parentalConsentReceived) {
		this.parentalConsentReceived = parentalConsentReceived;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLookupContactNo() {
		return lookupContactNo;
	}

	public void setLookupContactNo(String lookupContactNo) {
		this.lookupContactNo = lookupContactNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getExtensionNo() {
		return extensionNo;
	}

	public void setExtensionNo(String extensionNo) {
		this.extensionNo = extensionNo;
	}

	public String getMobilePhoneNo() {
		return mobilePhoneNo;
	}

	public void setMobilePhoneNo(String mobilePhoneNo) {
		this.mobilePhoneNo = mobilePhoneNo;
	}

	public String getPager() {
		return pager;
	}

	public void setPager(String pager) {
		this.pager = pager;
	}

	public String getOrganizationalLevelCode() {
		return organizationalLevelCode;
	}

	public void setOrganizationalLevelCode(String organizationalLevelCode) {
		this.organizationalLevelCode = organizationalLevelCode;
	}

	public int getExcludeFromSegment() {
		return excludeFromSegment;
	}

	public void setExcludeFromSegment(int excludeFromSegment) {
		this.excludeFromSegment = excludeFromSegment;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public int getCorrespondenceType() {
		return correspondenceType;
	}

	public void setCorrespondenceType(int correspondenceType) {
		this.correspondenceType = correspondenceType;
	}

	public String getSalutationCode() {
		return salutationCode;
	}

	public void setSalutationCode(String salutationCode) {
		this.salutationCode = salutationCode;
	}

	public String getSearchEmail() {
		return searchEmail;
	}

	public void setSearchEmail(String searchEmail) {
		this.searchEmail = searchEmail;
	}

	public Date getLastTimeModified() {
		return lastTimeModified;
	}

	public void setLastTimeModified(Date lastTimeModified) {
		this.lastTimeModified = lastTimeModified;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

}
