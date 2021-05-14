/**
 *   Copyright (C) 2011-2012 Typesafe Inc. <http://typesafe.com>
 */
package com.nikoszz.playervaults.lib.com.typesafe.config.impl;

import com.nikoszz.playervaults.lib.com.typesafe.config.ConfigIncluder;
import com.nikoszz.playervaults.lib.com.typesafe.config.ConfigIncluderClasspath;
import com.nikoszz.playervaults.lib.com.typesafe.config.ConfigIncluderFile;
import com.nikoszz.playervaults.lib.com.typesafe.config.ConfigIncluderURL;

interface FullIncluder extends ConfigIncluder, ConfigIncluderFile, ConfigIncluderURL,
            ConfigIncluderClasspath {

}
