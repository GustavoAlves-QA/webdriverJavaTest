package support;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

//notação
@Data
@Builder
@AllArgsConstructor





public class Cheque {
//    private String Gestor;
//    private String Administrador;
//    private String Custodiante;
//    private String Auditor;
//    private String Distribuidor;
//    private String Verificadora;
//    private Integer PatrimonioLiquido;
//    private Data DataDeFundacao;
//    private String GIIN;
//    private String Email;
//    private String SiteRI;
    //teste
    private Date data;
    //teste
    private Integer numeroCheque;
    //teste
    private String nome;
    //teste
    private BigDecimal valor;
    private String status;
    private Integer qtdeParcelas;
    private String formulaTotal;


}
