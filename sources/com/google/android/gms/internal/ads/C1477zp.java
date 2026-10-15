package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.zp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477zp {

    /* renamed from: a, reason: collision with root package name */
    public final int f11687a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11688b;
    public final boolean c;

    public C1477zp(int i4, int i5, boolean z4) {
        this.f11687a = i4;
        this.f11688b = i5;
        this.c = z4;
    }

    public static ArrayList a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i4 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i5 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z4 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new C1477zp(i4, i5, z4));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
