package Z;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f2288a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2289b;
    public final long c;
    public final long d;

    public n(int i4, int i5, long j4, long j5) {
        this.f2288a = i4;
        this.f2289b = i5;
        this.c = j4;
        this.d = j5;
    }

    public static n a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            n nVar = new n(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2288a);
            dataOutputStream.writeInt(this.f2289b);
            dataOutputStream.writeLong(this.c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (this.f2289b == nVar.f2289b && this.c == nVar.c && this.f2288a == nVar.f2288a && this.d == nVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2289b), Long.valueOf(this.c), Integer.valueOf(this.f2288a), Long.valueOf(this.d));
    }
}
