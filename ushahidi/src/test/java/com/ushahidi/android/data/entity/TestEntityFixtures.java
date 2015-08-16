/*
 * Copyright (c) 2015 Ushahidi Inc
 *
 * This program is free software: you can redistribute it and/or modify it under
 *  the terms of the GNU Affero General Public License as published by the Free
 *  Software Foundation, either version 3 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program in the file LICENSE-AGPL. If not, see
 *  https://www.gnu.org/licenses/agpl-3.0.html
 */

package com.ushahidi.android.data.entity;

import com.ushahidi.android.data.api.account.PlatformSession;

/**
 * @author Ushahidi Team <team@ushahidi.com>
 */
public class TestEntityFixtures {

    private static UserAccountEntity mUserAccountEntity;

    private static PlatformSession mPlatformSession;

    private static FormEntity mFormEntity;

    private TestEntityFixtures() {
        // No instances
    }

    public static UserAccountEntity getUserAccountEntity() {
        if (mUserAccountEntity == null) {
            mUserAccountEntity = new UserAccountEntity();
            mUserAccountEntity._id = 1l;
            mUserAccountEntity.setPassword("password");
            mUserAccountEntity.setAccountName("account name");
        }
        return mUserAccountEntity;
    }

    public static PlatformSession getPlatformSession() {
        if (mPlatformSession == null) {
            mPlatformSession = new PlatformSession(1, "user_name", 1);
        }
        return mPlatformSession;
    }

    public static FormEntity getFormEntity() {
        if (mFormEntity == null) {
            mFormEntity = new FormEntity();
            mFormEntity._id = 1l;
            mFormEntity.setCreated(new java.util.Date(1439502954));
            mFormEntity.setDescription("A Basic Form Entity");
            mFormEntity.setDeploymentId(1l);
            mFormEntity.setName("Basic form Entity");
            mFormEntity.setUpdated(new java.util.Date(1439503014));
            mFormEntity.setDisabled(true);
        }
        return mFormEntity;
    }
}
