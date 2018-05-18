package com.sustentacao.sustentacao.model;

import javax.persistence.*;

@Entity
@Table(name = "mp_componente")
    public class MpComponente {

    @Id
    @Column(name = "Cp_Nome")
        private String cpNome;

    @Column(name = "Dm_Codigo")
        private Integer dmCodigo;

    @Column(name = "Cp_Funcao")
        private String cpFuncao;

    @Column(name = "Cp_Funcional")
        private String cpFuncional;

    @Column(name = "Cp_Dt_Inclusao")
    @Temporal(TemporalType.TIMESTAMP)
        private java.util.Date cpDtInclusao;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Cp_Dt_Alteracao")
        private java.util.Date cpDtAlteracao;

    @Column(name = "Cp_Status")
        private String cpStatus;

    @Column(name = "Cp_Local")
        private Integer cpLocal;

    @Column(name = "Cp_SiglaSis")
        private String cpSiglaSis;

        public String getCpNome() {
            return cpNome;
        }

        public void setCpNome(String cpNome) {
            this.cpNome = cpNome;
        }


        public Integer getDmCodigo() {
            return dmCodigo;
        }

        public void setDmCodigo(Integer dmCodigo) {
            this.dmCodigo = dmCodigo;
        }


        public String getCpFuncao() {
            return cpFuncao;
        }

        public void setCpFuncao(String cpFuncao) {
            this.cpFuncao = cpFuncao;
        }


        public String getCpFuncional() {
            return cpFuncional;
        }

        public void setCpFuncional(String cpFuncional) {
            this.cpFuncional = cpFuncional;
        }


        public java.util.Date getCpDtInclusao() {
            return cpDtInclusao;
        }

        public void setCpDtInclusao(java.util.Date cpDtInclusao) {
            this.cpDtInclusao = cpDtInclusao;
        }


        public java.util.Date getCpDtAlteracao() {
            return cpDtAlteracao;
        }

        public void setCpDtAlteracao(java.util.Date cpDtAlteracao) {
            this.cpDtAlteracao = cpDtAlteracao;
        }


        public String getCpStatus() {
            return cpStatus;
        }

        public void setCpStatus(String cpStatus) {
            this.cpStatus = cpStatus;
        }


        public Integer getCpLocal() {
            return cpLocal;
        }

        public void setCpLocal(Integer cpLocal) {
            this.cpLocal = cpLocal;
        }


        public String getCpSiglaSis() {
            return cpSiglaSis;
        }

        public void setCpSiglaSis(String cpSiglaSis) {
            this.cpSiglaSis = cpSiglaSis;
        }

    }
