package br.com.joaoerik.estoqueAPI.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeproduto;

    private Integer categoriaId;
}
