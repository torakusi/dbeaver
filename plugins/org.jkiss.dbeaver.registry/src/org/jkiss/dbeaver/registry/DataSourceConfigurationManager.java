/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2022 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.registry;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPDataSourceConfigurationStorage;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Configuration files manager
 */
public interface DataSourceConfigurationManager {

    boolean isReadOnly();

    boolean isSecure();

    List<DBPDataSourceConfigurationStorage> getConfigurationStorages();

    InputStream readConfiguration(@NotNull String name) throws DBException, IOException;

    void writeConfiguration(@NotNull String name, @NotNull InputStream data) throws DBException, IOException;

}
