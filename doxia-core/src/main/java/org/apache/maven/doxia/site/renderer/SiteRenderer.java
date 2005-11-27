package org.apache.maven.doxia.site.renderer;

/*
 * Copyright 2004-2005 The Apache Software Foundation.
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

import org.apache.maven.doxia.module.xhtml.XhtmlSink;

import java.io.File;
import java.io.InputStream;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id:SiteRenderer.java 348605 2005-11-24 12:02:44 +1100 (Thu, 24 Nov 2005) brett $
 */
public interface SiteRenderer
{
    String ROLE = SiteRenderer.class.getName();

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory, File resourcesDirectory )
        throws Exception;

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory, String flavour,
                 File resourcesDirectory )
        throws Exception;

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory, String flavour,
                 String siteDescriptorName, File resourcesDirectory )
        throws Exception;

    void render( String siteDirectory, String generatedSiteDirectory, String outputDirectory, String flavour,
                 InputStream siteDescriptor, File resourcesDirectory )
        throws Exception;

    XhtmlSink createSink( File moduleBasedir, String doc, String outputDirectory, File siteDescriptor, String flavour )
        throws Exception;

    XhtmlSink createSink( File moduleBasedir, String doc, String outputDirectory, InputStream siteDescriptor,
                          String flavour )
        throws Exception;

    void copyResources( String outputDirectory, String flavour )
        throws Exception;
}