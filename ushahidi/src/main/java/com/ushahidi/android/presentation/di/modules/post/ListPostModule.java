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

package com.ushahidi.android.presentation.di.modules.post;

import com.addhen.android.raiburari.data.pref.LongPreference;
import com.addhen.android.raiburari.data.pref.StringPreference;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import com.ushahidi.android.domain.usecase.post.ListPostUsecase;

import android.content.SharedPreferences;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author Ushahidi Team <team@ushahidi.com>
 */
@Module
public class ListPostModule {

    @Provides
    @ActivityScope
    @Named("postList")
    ListPostUsecase provideListPostUseCase(ListPostUsecase listPostUsecase) {
        return listPostUsecase;
    }

    @Provides
    @Named("activeDeploymentPref")
    StringPreference providesActiveDeploymentPref(SharedPreferences sharedPreferences) {
        return new StringPreference(sharedPreferences, "active_deployment_url", null);
    }

    @Provides
    @Named("accessTokenPref")
    StringPreference provideAccessTokenPref(SharedPreferences sharedPreferences) {
        return new StringPreference(sharedPreferences, "access_token", null);
    }

    @Provides
    @Named("activeDeploymentIdPref")
    LongPreference getActiveDeploymentIdPref(SharedPreferences sharedPreferences) {
        return new LongPreference(sharedPreferences, "active_deployment_id", 0);
    }
}