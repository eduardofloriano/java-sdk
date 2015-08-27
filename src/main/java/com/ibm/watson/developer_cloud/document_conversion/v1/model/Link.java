/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ibm.watson.developer_cloud.document_conversion.v1.model;

import com.google.gson.annotations.Expose;
import com.ibm.watson.developer_cloud.document_conversion.v1.DocumentConversion;

/**
 * Structure for links
 *
 * @see DocumentConversion
 */
public class Link extends DocumentConversionModel {

    /**
     * The name of the link
     */
    @Expose
    private String name;

    /**
     * The link to the document
     */
    @Expose
    private String link;

    /**
     * Returns the name of the link
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the link
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the link to the document
     *
     * @return
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the link to the document
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

}
