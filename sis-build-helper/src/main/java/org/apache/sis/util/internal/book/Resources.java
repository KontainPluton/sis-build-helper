/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sis.util.internal.book;

import java.util.ListResourceBundle;


/**
 * Localized resources, for internal usage only.
 *
 * @author  Martin Desruisseaux (Geomatys)
 * @version 0.7
 * @since   0.7
 */
public class Resources extends ListResourceBundle {
    /**
     * Invoked by resource bundle reflection mechanism.
     */
    public Resources() {
    }

    /**
     * Returns resources as pair of key-value.
     *
     * @return an array of key-value pairs.
     */
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            new Object[] {"previous-chapter", "Previous chapter"},
            new Object[] {"next-chapter",     "Next chapter"},
            new Object[] {"this-chapter",     "In this chapter:"}
        };
    }
}
