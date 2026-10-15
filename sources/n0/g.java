package n0;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final String f14089b = n.h("Data");
    public static final g c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14090a;

    static {
        g gVar = new g(new HashMap());
        b(gVar);
        c = gVar;
    }

    public g(HashMap hashMap) {
        this.f14090a = new HashMap(hashMap);
    }

    public g(g gVar) {
        this.f14090a = new HashMap(gVar.f14090a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if (r4 != null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static n0.g a(byte[] r8) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            java.lang.String r1 = n0.g.f14089b
            int r2 = r8.length
            r3 = 10240(0x2800, float:1.4349E-41)
            if (r2 > r3) goto L6e
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            r3.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L44 java.lang.ClassNotFoundException -> L48 java.io.IOException -> L4d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L44 java.lang.ClassNotFoundException -> L48 java.io.IOException -> L4d
            int r8 = r4.readInt()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L2f java.io.IOException -> L31
        L1d:
            if (r8 <= 0) goto L33
            java.lang.String r5 = r4.readUTF()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L2f java.io.IOException -> L31
            java.lang.Object r6 = r4.readObject()     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L2f java.io.IOException -> L31
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L2d java.lang.ClassNotFoundException -> L2f java.io.IOException -> L31
            int r8 = r8 + (-1)
            goto L1d
        L2d:
            r8 = move-exception
            goto L5b
        L2f:
            r8 = move-exception
            goto L4f
        L31:
            r8 = move-exception
            goto L4f
        L33:
            r4.close()     // Catch: java.io.IOException -> L37
            goto L3b
        L37:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
        L3b:
            r3.close()     // Catch: java.io.IOException -> L3f
            goto L55
        L3f:
            r8 = move-exception
            android.util.Log.e(r1, r0, r8)
            goto L55
        L44:
            r2 = move-exception
            r4 = r8
            r8 = r2
            goto L5b
        L48:
            r4 = move-exception
        L49:
            r7 = r4
            r4 = r8
            r8 = r7
            goto L4f
        L4d:
            r4 = move-exception
            goto L49
        L4f:
            android.util.Log.e(r1, r0, r8)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L3b
            goto L33
        L55:
            n0.g r8 = new n0.g
            r8.<init>(r2)
            return r8
        L5b:
            if (r4 == 0) goto L65
            r4.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L65:
            r3.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L6d:
            throw r8
        L6e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.g.a(byte[]):n0.g");
    }

    public static byte[] b(g gVar) {
        ObjectOutputStream objectOutputStream;
        String str = f14089b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e4) {
            e = e4;
        }
        try {
            objectOutputStream.writeInt(gVar.f14090a.size());
            for (Map.Entry entry : gVar.f14090a.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e5) {
                Log.e(str, "Error in Data#toByteArray: ", e5);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(str, "Error in Data#toByteArray: ", e6);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e7) {
            e = e7;
            objectOutputStream2 = objectOutputStream;
            Log.e(str, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e8) {
                    Log.e(str, "Error in Data#toByteArray: ", e8);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(str, "Error in Data#toByteArray: ", e9);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e10) {
                    Log.e(str, "Error in Data#toByteArray: ", e10);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e11) {
                Log.e(str, "Error in Data#toByteArray: ", e11);
                throw th;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass()) {
                HashMap hashMap = ((g) obj).f14090a;
                HashMap hashMap2 = this.f14090a;
                Set<String> keySet = hashMap2.keySet();
                if (keySet.equals(hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14090a.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        HashMap hashMap = this.f14090a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = hashMap.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
