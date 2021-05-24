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
	
	@Column(name = "[Country]")
	private String country;
	
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
}
