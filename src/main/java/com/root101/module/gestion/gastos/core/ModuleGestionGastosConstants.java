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
package com.root101.module.gestion.gastos.core;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class ModuleGestionGastosConstants {

    public static final String GASTOS_GENERAL_PATH = "/gasto";

    //-----------------------TIPO GASTO-----------------------\\
    public static final String TIPO_GASTO_GENERAL_PATH = GASTOS_GENERAL_PATH + "/tipo_gastos";

    //-----------------------GASTO-----------------------\\
    public static final String GASTOS_GASTOS_GENERAL_PATH = GASTOS_GENERAL_PATH + "/gastos";

    public static final String GASTO_REPORTE_POR_TIPO_PATH = "/reporte_por_tipo";
    public static final RequestMethod GASTO_REPORTE_POR_TIPO_METHOD = RequestMethod.GET;

}
