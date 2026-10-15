package W1;

import android.os.Bundle;
import android.util.JsonReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f1993a;

    /* renamed from: b, reason: collision with root package name */
    public String f1994b;
    public final Bundle c = new Bundle();

    public f(JsonReader jsonReader) {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    hashMap = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                    }
                    jsonReader.endObject();
                }
                jsonReader.skipValue();
            } else if (nextName.equals("params")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        this.f1993a = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }
}
