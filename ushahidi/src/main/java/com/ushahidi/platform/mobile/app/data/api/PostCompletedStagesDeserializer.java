/*
 * Copyright (c) 2015 Ushahidi.
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 *  FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program in the file LICENSE-AGPL. If not, see
 *  https://www.gnu.org/licenses/agpl-3.0.html
 */

package com.ushahidi.platform.mobile.app.data.api;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import com.ushahidi.platform.mobile.app.data.entity.PostCompletedStagesEntity;

import java.lang.reflect.Type;

/**
 * @author Ushahidi Team <team@ushahidi.com>
 */
public class PostCompletedStagesDeserializer
        implements JsonDeserializer<PostCompletedStagesEntity> {

    @Override
    public PostCompletedStagesEntity deserialize(JsonElement json, Type typeOfT,
            JsonDeserializationContext context)
            throws JsonParseException {
        PostCompletedStagesEntity postCompletedEntity = new PostCompletedStagesEntity();
        postCompletedEntity.setCompletedStep(new Gson().toJson(json));
        return postCompletedEntity;
    }
}
