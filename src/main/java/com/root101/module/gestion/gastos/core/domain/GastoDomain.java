/*
 * Copyright 2021 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.root101.module.gestion.gastos.core.domain;

import com.root101.module.gestion.contabilidad.core.domain.MonedaDomain;
import com.root101.module.gestion.contabilidad.core.domain.Pagable;
import com.root101.module.gestion.contabilidad.core.domain.CuadreDomain;
import javax.validation.constraints.NotNull;
import com.root101.utils.clean.EntityDomainObjectValidated;
import java.math.BigDecimal;
import javax.validation.constraints.Max;
import javax.validation.constraints.PositiveOrZero;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class GastoDomain extends EntityDomainObjectValidated implements Comparable<GastoDomain>, Pagable{

    private Integer idGasto;

    @Max(value = Long.MAX_VALUE, message = "#msg.module.contabilidad.validation.valor_muy_grande#")
    @PositiveOrZero(message = "#msg.module.gasto.validation.gasto_valor_negativo#")
    private BigDecimal valor;

    @NotNull(message = "#msg.module.gasto.validation.gasto_cuadre_null#")
    private CuadreDomain cuadreFk;

    @NotNull(message = "#msg.module.gasto.validation.gasto_moneda_null#")
    private MonedaDomain monedaFk;

    @NotNull(message = "#msg.module.gasto.validation.gasto_tipo_null#")
    private TipoGastoDomain tipoGastoFk;

    public GastoDomain() {
    }

    public GastoDomain(Integer idGasto) {
        this.idGasto = idGasto;
    }

    public GastoDomain(BigDecimal valor, MonedaDomain monedaFk, CuadreDomain cuadreFk, TipoGastoDomain tipoGastoFk) {
        this.valor = valor;
        this.monedaFk = monedaFk;
        this.cuadreFk = cuadreFk;
        this.tipoGastoFk = tipoGastoFk;
        validate();
    }

    public Integer getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(Integer idGasto) {
        this.idGasto = idGasto;
    }

    @Override
    public BigDecimal getValor() {
        return valor;
    }

    @Override
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public CuadreDomain getCuadreFk() {
        return cuadreFk;
    }

    @Override
    public void setCuadreFk(CuadreDomain cuadreFk) {
        this.cuadreFk = cuadreFk;
    }

    @Override
    public MonedaDomain getMonedaFk() {
        return monedaFk;
    }

    public void setMonedaFk(MonedaDomain monedaFk) {
        this.monedaFk = monedaFk;
    }

    public TipoGastoDomain getTipoGastoFk() {
        return tipoGastoFk;
    }

    public void setTipoGastoFk(TipoGastoDomain tipoGastoFk) {
        this.tipoGastoFk = tipoGastoFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGasto != null ? idGasto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GastoDomain)) {
            return false;
        }
        GastoDomain other = (GastoDomain) object;
        if ((this.idGasto == null && other.idGasto != null) || (this.idGasto != null && !this.idGasto.equals(other.idGasto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return cuadreFk.info().getNombre();
    }

    @Override
    public int compareTo(GastoDomain o) {
        return -getCuadreFk().info().getFecha().compareTo(o.getCuadreFk().info().getFecha());
    }

}
