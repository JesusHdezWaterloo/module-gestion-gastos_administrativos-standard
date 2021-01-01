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
import com.root101.module.gestion.contabilidad.core.domain.FormaPagoDomain;
import com.root101.module.gestion.contabilidad.core.domain.TipoOperacionContableDomain;
import com.root101.module.gestion.contabilidad.core.domain.TipoPagable;
import com.root101.clean.core.utils.SortBy;
import com.root101.utils.clean.EntityDomainObjectValidated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@SortBy(priority = {"nombreGasto"})
public class TipoGastoDomain extends EntityDomainObjectValidated implements TipoPagable {

    private Integer idTipoGasto;

    @NotEmpty(message = "#msg.module.gasto.validation.tipo_gasto_nombre_vacio#")
    @Size(max = 95, message = "#msg.module.gasto.validation.tipo_gasto_nombre_largo#")
    private String nombreGasto;

    @Size(max = 495, message = "#msg.module.contabilidad.validation.descripcion_larga#")
    private String descripcion;

    @NotNull(message = "#msg.module.gasto.validation.tipo_gasto_moneda_null#")
    private MonedaDomain monedaDefectoFk;

    @NotNull(message = "#msg.module.gasto.validation.tipo_gasto_operacion_null#")
    private TipoOperacionContableDomain tipoOperacionContableDefectoFk;

    @NotNull(message = "#msg.module.gasto.validation.tipo_gasto_forma_pago_null#")
    private FormaPagoDomain formaPagoFk;

    public TipoGastoDomain() {
    }

    public TipoGastoDomain(Integer idTipoGasto) {
        this.idTipoGasto = idTipoGasto;
    }

    public TipoGastoDomain(String nombreGasto, String descripcion, MonedaDomain monedaDefectoFk, TipoOperacionContableDomain tipoOperacionContableDefectoFk, FormaPagoDomain formaPagoFk) {
        this.nombreGasto = nombreGasto;
        this.descripcion = descripcion;
        this.monedaDefectoFk = monedaDefectoFk;
        this.tipoOperacionContableDefectoFk = tipoOperacionContableDefectoFk;
        this.formaPagoFk = formaPagoFk;
        validate();
    }

    public Integer getIdTipoGasto() {
        return idTipoGasto;
    }

    public void setIdTipoGasto(Integer idTipoGasto) {
        this.idTipoGasto = idTipoGasto;
    }

    public String getNombreGasto() {
        return nombreGasto;
    }

    public void setNombreGasto(String nombreGasto) {
        this.nombreGasto = nombreGasto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public MonedaDomain getMonedaDefectoFk() {
        return monedaDefectoFk;
    }

    @Override
    public void setMonedaDefectoFk(MonedaDomain monedaDefectoFk) {
        this.monedaDefectoFk = monedaDefectoFk;
    }

    @Override
    public TipoOperacionContableDomain getTipoOperacionContableDefectoFk() {
        return tipoOperacionContableDefectoFk;
    }

    @Override
    public void setTipoOperacionContableDefectoFk(TipoOperacionContableDomain tipoOperacionContableDefectoFk) {
        this.tipoOperacionContableDefectoFk = tipoOperacionContableDefectoFk;
    }

    @Override
    public FormaPagoDomain getFormaPagoFk() {
        return formaPagoFk;
    }

    @Override
    public void setFormaPagoFk(FormaPagoDomain formaPagoFk) {
        this.formaPagoFk = formaPagoFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoGasto != null ? idTipoGasto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoGastoDomain)) {
            return false;
        }
        TipoGastoDomain other = (TipoGastoDomain) object;
        if ((this.idTipoGasto == null && other.idTipoGasto != null) || (this.idTipoGasto != null && !this.idTipoGasto.equals(other.idTipoGasto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreGasto;
    }

}
