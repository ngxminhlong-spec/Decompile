package t3;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import s3.C1981a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e implements q3.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f14953f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    public static final q3.c f14954g;

    /* renamed from: h, reason: collision with root package name */
    public static final q3.c f14955h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1981a f14956i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f14957a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14958b;
    public final HashMap c;
    public final q3.d d;

    /* renamed from: e, reason: collision with root package name */
    public final h f14959e = new h(this);

    static {
        C2008a c2008a = new C2008a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(d.class, c2008a);
        f14954g = new q3.c("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        C2008a c2008a2 = new C2008a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(d.class, c2008a2);
        f14955h = new q3.c("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        f14956i = new C1981a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, q3.d dVar) {
        this.f14957a = byteArrayOutputStream;
        this.f14958b = hashMap;
        this.c = hashMap2;
        this.d = dVar;
    }

    public static int f(q3.c cVar) {
        d dVar = (d) ((Annotation) cVar.f14715b.get(d.class));
        if (dVar != null) {
            return ((C2008a) dVar).f14949a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override // q3.e
    public final q3.e a(q3.c cVar, long j4) {
        if (j4 == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) cVar.f14715b.get(d.class));
        if (dVar == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        g(((C2008a) dVar).f14949a << 3);
        h(j4);
        return this;
    }

    public final void b(q3.c cVar, int i4, boolean z4) {
        if (z4 && i4 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f14715b.get(d.class));
        if (dVar == null) {
            throw new RuntimeException("Field has no @Protobuf config");
        }
        g(((C2008a) dVar).f14949a << 3);
        g(i4);
    }

    public final void c(q3.c cVar, Object obj, boolean z4) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z4 && charSequence.length() == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f14953f);
            g(bytes.length);
            this.f14957a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f14956i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z4 && doubleValue == 0.0d) {
                return;
            }
            g((f(cVar) << 3) | 1);
            this.f14957a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z4 && floatValue == 0.0f) {
                return;
            }
            g((f(cVar) << 3) | 5);
            this.f14957a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z4 && longValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) cVar.f14715b.get(d.class));
            if (dVar == null) {
                throw new RuntimeException("Field has no @Protobuf config");
            }
            g(((C2008a) dVar).f14949a << 3);
            h(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z4 && bArr.length == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            g(bArr.length);
            this.f14957a.write(bArr);
            return;
        }
        q3.d dVar2 = (q3.d) this.f14958b.get(obj.getClass());
        if (dVar2 != null) {
            e(dVar2, cVar, obj, z4);
            return;
        }
        q3.f fVar = (q3.f) this.c.get(obj.getClass());
        if (fVar != null) {
            h hVar = this.f14959e;
            hVar.f14964a = false;
            hVar.c = cVar;
            hVar.f14965b = z4;
            fVar.a(obj, hVar);
            return;
        }
        if (obj instanceof z1.c) {
            b(cVar, ((z1.c) obj).f15958o, true);
        } else if (obj instanceof Enum) {
            b(cVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.d, cVar, obj, z4);
        }
    }

    @Override // q3.e
    public final q3.e d(q3.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, t3.b] */
    public final void e(q3.d dVar, q3.c cVar, Object obj, boolean z4) {
        ?? outputStream = new OutputStream();
        outputStream.f14950o = 0L;
        try {
            OutputStream outputStream2 = this.f14957a;
            this.f14957a = outputStream;
            try {
                dVar.a(obj, this);
                this.f14957a = outputStream2;
                long j4 = outputStream.f14950o;
                outputStream.close();
                if (z4 && j4 == 0) {
                    return;
                }
                g((f(cVar) << 3) | 2);
                h(j4);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f14957a = outputStream2;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                outputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i4) {
        while ((i4 & (-128)) != 0) {
            this.f14957a.write((i4 & 127) | 128);
            i4 >>>= 7;
        }
        this.f14957a.write(i4 & 127);
    }

    public final void h(long j4) {
        while (((-128) & j4) != 0) {
            this.f14957a.write((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        this.f14957a.write(((int) j4) & 127);
    }
}
