/*
 * This file is part of Discord4J.
 *
 * Discord4J is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Discord4J is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */
package discord4j.common.json;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import discord4j.common.jackson.UnsignedJson;
import reactor.util.annotation.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

public class UserResponse {

    @UnsignedJson
    private long id;
    private String username;
    private String discriminator;
    @Nullable
    private String avatar;
    @Nullable
    private Boolean bot;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<>();

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    @Nullable
    public String getAvatar() {
        return avatar;
    }

    @Nullable
    public Boolean isBot() {
        return bot;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", discriminator='" + discriminator + '\'' +
                ", avatar='" + avatar + '\'' +
                ", bot=" + bot +
                '}';
    }
}
