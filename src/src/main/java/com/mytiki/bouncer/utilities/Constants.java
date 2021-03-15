/*
 * Copyright (c) TIKI Inc.
 * MIT license. See LICENSE file in root directory.
 */

package com.mytiki.bouncer.utilities;

public interface Constants {

    String MODULE_DOT_PATH = "com.mytiki.bouncer";
    String MODULE_SLASH_PATH = "com/mytiki/bouncer";

    String SLICE_FEATURES = "features";
    String SLICE_LATEST = "latest";

    String PACKAGE_FEATURES_LATEST_DOT_PATH = MODULE_DOT_PATH + "." + SLICE_FEATURES + "." + SLICE_LATEST;
    String PACKAGE_FEATURES_LATEST_SLASH_PATH = MODULE_SLASH_PATH + "/" + SLICE_FEATURES + "/" + SLICE_LATEST;

    String AUTHORITY_BASE = "AUTHORITY_";
    String AUTHORITY_READ = AUTHORITY_BASE + "READ";
    String AUTHORITY_WRITE = AUTHORITY_BASE + "WRITE";
    String AUTHORITY_ADMIN = AUTHORITY_BASE + "ADMIN";

    String OAUTH_TOKEN_TYPE_BEARER = "bearer";
}
