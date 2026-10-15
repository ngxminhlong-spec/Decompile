package s3;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import q3.f;
import q3.g;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1985e implements q3.e, g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14809a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f14810b;
    public final Map c;
    public final Map d;

    /* renamed from: e, reason: collision with root package name */
    public final q3.d f14811e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14812f;

    public C1985e(BufferedWriter bufferedWriter, HashMap hashMap, HashMap hashMap2, C1981a c1981a, boolean z4) {
        this.f14810b = new JsonWriter(bufferedWriter);
        this.c = hashMap;
        this.d = hashMap2;
        this.f14811e = c1981a;
        this.f14812f = z4;
    }

    @Override // q3.e
    public final q3.e a(q3.c cVar, long j4) {
        String str = cVar.f14714a;
        g();
        JsonWriter jsonWriter = this.f14810b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j4);
        return this;
    }

    @Override // q3.g
    public final g b(String str) {
        g();
        this.f14810b.value(str);
        return this;
    }

    @Override // q3.g
    public final g c(boolean z4) {
        g();
        this.f14810b.value(z4);
        return this;
    }

    @Override // q3.e
    public final q3.e d(q3.c cVar, Object obj) {
        f(obj, cVar.f14714a);
        return this;
    }

    public final C1985e e(Object obj) {
        JsonWriter jsonWriter = this.f14810b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i4 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f(entry.getValue(), (String) key);
                    } catch (ClassCastException e4) {
                        throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e4);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            q3.d dVar = (q3.d) this.c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            f fVar = (f) this.d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                g();
                jsonWriter.value(name);
                return this;
            }
            jsonWriter.beginObject();
            this.f14811e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i4 < length) {
                jsonWriter.value(r7[i4]);
                i4++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i4 < length2) {
                long j4 = jArr[i4];
                g();
                jsonWriter.value(j4);
                i4++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i4 < length3) {
                jsonWriter.value(dArr[i4]);
                i4++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i4 < length4) {
                jsonWriter.value(zArr[i4]);
                i4++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i4 < length5) {
                e(numberArr[i4]);
                i4++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i4 < length6) {
                e(objArr[i4]);
                i4++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final C1985e f(Object obj, String str) {
        boolean z4 = this.f14812f;
        JsonWriter jsonWriter = this.f14810b;
        if (z4) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            e(obj);
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        e(obj);
        return this;
    }

    public final void g() {
        if (!this.f14809a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
