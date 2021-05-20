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
@Table(name = "[OZONA CONSULTING, S_L_$Job]", schema="[dbo]")
public class Proyect {
	@Column(name = "[timestamp]")
	private byte[] timestamp;
	
	@Id
	@Column(name = "[No_]")
	private String no;
	
	@Column(name = "[Search Description]")
	private String searchDescription;
	
	@Column(name = "[Description]")
	private String description;
	
	@Column(name = "[Description 2]")
	private String description2;
	
	@Column(name = "[Bill-to Customer No_]")
	private String billToCustomerNo;
	
	@Column(name = "[Creation Date]")
	private Date creationDate;
	
	@Column(name = "[Starting Date]")
	private Date startingDate;
	
	@Column(name = "[Ending Date]")
	private Date endingDate;
	
	@Column(name = "[Status]")
	private int status;
	
	@Column(name = "[Person Responsible]")
	private String personResponsible;
	
	@Column(name = "[Global Dimension 1 Code]")
	private String globalDimension1Code;
	
	@Column(name = "[Global Dimension 2 Code]")
	private String globalDimension2Code;
	
	@Column(name = "[Job Posting Group]")
	private String jobPostingGroup;
	
	@Column(name = "[Blocked]")
	private int blocked;
	
	@Column(name = "[Last Date Modified]")
	private Date lastDateModified;
	
	@Column(name = "[Customer Disc_ Group]")
	private String customerDiscGroup;
	
	@Column(name = "[Customer Price Group]")
	private String customerPriceGroup;
	
	@Column(name = "[Language Code]")
	private String languageCode;
	
	@Lob
	@Column(name = "[Picture]")
	private Byte[] picture;
	
	@Column(name = "[Bill-to Name]")
	private String billToName;
	
	@Column(name = "[Bill-to Address]")
	private String billToAddress;
	
	@Column(name = "[Bill-to Address 2]")
	private String billToAddress2;
	
	@Column(name = "[Bill-to City]")
	private String billToCity;
	
	@Column(name = "[Bill-to Country]")
	private String billToCountry;
	
	@Column(name = "[Bill-to Post Code]")
	private String billToPostCode;
	
	@Column(name = "[No_ Series]")
	private String NoSeries;
	
	@Column(name = "[Bill-to Country_Region Code]")
	private String billToCountryRegionCode;
	
	@Column(name = "[Bill-to Name 2]")
	private String billtToName2;
	
	@Column(name = "[Reserve]")
	private int reserve;
	
	@Column(name = "[WIP Method]")
	private String wipMethod;
	
	@Column(name = "[Currency Code]")
	private String currencyCode;
	
	@Column(name = "[Bill-to Contact No_]")
	private String billToContactNo;
	
	@Column(name = "[Bill-to Contact]")
	private String billToContact;
	
	@Column(name = "[WIP Posting Date]")
	private Date wipPostingDate;
	
	@Column(name = "[Invoice Currency Code]")
	private String invoiceCurrencyCode;
	
	@Column(name = "[Exch_ Calculation (Cost)]")
	private int exchCalculationCost;
	
	@Column(name = "[Exch_ Calculation (Price)]")
	private int exchCalculationPrice;
	
	@Column(name = "[Allow Schedule_Contract Lines]")
	private int allowSheduleContractLines;
	
	@Column(name = "[Complete]")
	private int complete;
	
	@Column(name = "[Apply Usage Link]")
	private int apllyUsageLink;
	
	@Column(name = "[WIP Posting Method]")
	private int wipPostingMethod;
	
	@Column(name = "[Cod_ Dimension 4]")
	private String codDimension4;
	
	@Column(name = "[Cliente intermedio]")
	private String clienteIntermedio;
	
	@Column(name = "[Cliente final]")
	private String clienteFinal;
	
	@Column(name = "[Bloqueo administracion]")
	private int bloqueoAdministracion;
	
	@Column(name = "[Tipo calculo]")
	private int tipoCalculo;
	
	@Column(name = "[Fecha prevista cierre]")
	private Date fechaPrevistaCierre;
	
	@Column(name = "[Proyecto matriz - trabajo]")
	private int proyectoMatrizTrabajo;
	
	@Column(name = "[Proy_ matriz al que pertenece]")
	private String proyMatrizAlQuePertenece;
	
	@Column(name = "[Clasificacion]")
	private String clasificacion;
	
	@Column(name = "[Resultado encuesta]")
	private float resultadoEncuesta;
	
	@Column(name = "[Centro Responsabilidad]")
	private String centroResponsabilidad;
	
	@Column(name = "[Responsable comercial]")
	private String responsableComercial;
	
	@Column(name = "[Fecha prevista pedido]")
	private Date fechaPrevistaPedido;
	
	@Column(name = "[Fecha venta]")
	private Date fechaVenta;
	
	@Column(name = "[Allocation Breakdown]")
	private int allocationBreakdown;
	
	@Column(name = "[Fecha adjudicacion definitiva]")
	private Date fechaAdjudicacionDefinitiva;
	
	@Column(name = "[Job Type]")
	private int jobType;
	
	@Column(name = "[Control Type]")
	private int controlType;
	
}
