package d3;

import C0.C0003c;
import H.A;
import H.AbstractC0044t;
import H.C0050z;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b0.AbstractC0178L;
import b0.C0167A;
import b0.Z;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C0544dz;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.measurement.C1509e0;
import com.google.android.gms.internal.measurement.T;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.Y;
import com.google.android.gms.internal.play_billing.B;
import com.google.android.gms.internal.play_billing.C1628n0;
import com.google.android.gms.internal.play_billing.C1638t;
import com.google.android.gms.internal.play_billing.E;
import com.google.android.gms.internal.play_billing.F;
import com.google.android.gms.internal.play_billing.InterfaceC1622k0;
import com.google.android.gms.internal.play_billing.J;
import com.google.android.gms.internal.play_billing.M;
import com.google.firebase.analytics.FirebaseAnalytics;
import d1.C1650a;
import f.AbstractActivityC1671f;
import g.AbstractC1678a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import m2.AbstractC1806a;
import n3.C1814a;
import n3.q;
import org.xmlpull.v1.XmlPullParser;
import q1.AbstractC1959n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1654b implements J.h {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f12604a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f12605b;
    public static boolean c;
    public static Field d;

    /* renamed from: e, reason: collision with root package name */
    public static FirebaseAnalytics f12606e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f12607f;

    /* renamed from: g, reason: collision with root package name */
    public static Integer f12608g;

    public static View B(ViewGroup viewGroup, C1650a c1650a) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(c1650a.c, viewGroup, false);
    }

    public static void C(MainActivity mainActivity) {
        String str = AbstractC1806a.f14026f0;
        String str2 = null;
        boolean z4 = false;
        if (str == null) {
            String string = mainActivity.getPreferences(0).getString("user_id", null);
            AbstractC1806a.f14026f0 = string;
            if (string == null) {
                String uuid = UUID.randomUUID().toString();
                AbstractC1806a.f14026f0 = uuid;
                SharedPreferences.Editor edit = mainActivity.getPreferences(0).edit();
                edit.putString("user_id", uuid);
                edit.apply();
                AbstractC1806a.f14026f0 = uuid;
            }
            str = AbstractC1806a.f14026f0;
        }
        boolean c2 = AbstractC1959n.c(mainActivity);
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(mainActivity);
        f12606e = firebaseAnalytics;
        C1509e0 c1509e0 = firebaseAnalytics.f12544a;
        c1509e0.getClass();
        c1509e0.b(new T(c1509e0, str, 0));
        FirebaseAnalytics firebaseAnalytics2 = f12606e;
        String valueOf = String.valueOf(c2);
        C1509e0 c1509e02 = firebaseAnalytics2.f12544a;
        c1509e02.getClass();
        c1509e02.b(new Y(c1509e02, str2, "OldUser", valueOf, z4, 2));
        C1509e0 c1509e03 = f12606e.f12544a;
        Boolean bool = Boolean.TRUE;
        c1509e03.getClass();
        c1509e03.b(new U(c1509e03, bool));
    }

    public static List D(Object... objArr) {
        if (objArr.length <= 0) {
            return K3.d.f1067o;
        }
        List asList = Arrays.asList(objArr);
        S3.e.d(asList, "asList(...)");
        return asList;
    }

    public static void E(String str) {
        FirebaseAnalytics firebaseAnalytics = f12606e;
        if (firebaseAnalytics == null) {
            return;
        }
        C1509e0 c1509e0 = firebaseAnalytics.f12544a;
        c1509e0.getClass();
        c1509e0.b(new Y(c1509e0, null, str, null, false, 1));
    }

    public static String F(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            sb.append(str.charAt(i4));
            if (str2.length() > i4) {
                sb.append(str2.charAt(i4));
            }
        }
        return sb.toString();
    }

    public static MappedByteBuffer G(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void P(View view, V2.g gVar) {
        M2.a aVar = gVar.f1880o.f1855b;
        if (aVar == null || !aVar.f1148a) {
            return;
        }
        float f4 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = A.f779a;
            f4 += AbstractC0044t.d((View) parent);
        }
        V2.f fVar = gVar.f1880o;
        if (fVar.f1863l != f4) {
            fVar.f1863l = f4;
            gVar.l();
        }
    }

    public static void R(Parcel parcel, int i4, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        parcel.writeBundle(bundle);
        e0(parcel, a02);
    }

    public static void S(Parcel parcel, int i4, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        parcel.writeByteArray(bArr);
        e0(parcel, a02);
    }

    public static void T(Parcel parcel, int i4, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        parcel.writeStrongBinder(iBinder);
        e0(parcel, a02);
    }

    public static void U(Parcel parcel, int i4, Parcelable parcelable, int i5) {
        if (parcelable == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        parcelable.writeToParcel(parcel, i5);
        e0(parcel, a02);
    }

    public static void V(Parcel parcel, int i4, String str) {
        if (str == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        parcel.writeString(str);
        e0(parcel, a02);
    }

    public static void W(Parcel parcel, int i4, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        parcel.writeStringArray(strArr);
        e0(parcel, a02);
    }

    public static void X(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        parcel.writeStringList(list);
        e0(parcel, a02);
    }

    public static void Y(Parcel parcel, int i4, Parcelable[] parcelableArr, int i5) {
        if (parcelableArr == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i5);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        e0(parcel, a02);
    }

    public static void Z(Parcel parcel, int i4, List list) {
        if (list == null) {
            return;
        }
        int a02 = a0(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcelable parcelable = (Parcelable) list.get(i5);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        e0(parcel, a02);
    }

    public static void a(AbstractActivityC1671f abstractActivityC1671f, int i4) {
        boolean z4;
        Boolean bool = f12607f;
        if (bool != null) {
            z4 = bool.booleanValue();
        } else {
            z4 = abstractActivityC1671f.getPreferences(0).getBoolean("rate_shown", false);
            f12607f = Boolean.valueOf(z4);
        }
        if (z4) {
            return;
        }
        int x4 = x(abstractActivityC1671f) + i4;
        SharedPreferences.Editor edit = abstractActivityC1671f.getPreferences(0).edit();
        edit.putInt("rate_power", x4);
        edit.apply();
        f12608g = Integer.valueOf(x4);
    }

    public static int a0(Parcel parcel, int i4) {
        parcel.writeInt(i4 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void b(Throwable th, Throwable th2) {
        S3.e.e(th, "<this>");
        S3.e.e(th2, "exception");
        if (th != th2) {
            Integer num = P3.a.f1612a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = O3.a.f1469a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static int b0(byte[] bArr, int i4, C0544dz c0544dz) {
        int i02 = i0(bArr, i4, c0544dz);
        int i5 = c0544dz.f8529a;
        if (i5 < 0) {
            throw M.b();
        }
        if (i5 > bArr.length - i02) {
            throw M.c();
        }
        if (i5 == 0) {
            c0544dz.c = C1638t.f12244q;
            return i02;
        }
        c0544dz.c = C1638t.l(bArr, i02, i5);
        return i02 + i5;
    }

    public static Object c0(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            Y9.q("Unexpected exception.", th);
            C0275Ga.b(context).g("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }

    public static int d0(int i4, byte[] bArr) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public static void e0(Parcel parcel, int i4) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(dataPosition - i4);
        parcel.setDataPosition(dataPosition);
    }

    public static void f0(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }

    public static int g0(InterfaceC1622k0 interfaceC1622k0, int i4, byte[] bArr, int i5, int i6, J j4, C0544dz c0544dz) {
        E a4 = interfaceC1622k0.a();
        InterfaceC1622k0 interfaceC1622k02 = interfaceC1622k0;
        byte[] bArr2 = bArr;
        int i7 = i6;
        C0544dz c0544dz2 = c0544dz;
        int m02 = m0(a4, interfaceC1622k02, bArr2, i5, i7, c0544dz2);
        interfaceC1622k02.b(a4);
        c0544dz2.c = a4;
        j4.add(a4);
        while (m02 < i7) {
            C0544dz c0544dz3 = c0544dz2;
            int i8 = i7;
            int i02 = i0(bArr2, m02, c0544dz3);
            if (i4 != c0544dz3.f8529a) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC1622k0 interfaceC1622k03 = interfaceC1622k02;
            E a5 = interfaceC1622k03.a();
            m02 = m0(a5, interfaceC1622k03, bArr3, i02, i8, c0544dz3);
            interfaceC1622k02 = interfaceC1622k03;
            bArr2 = bArr3;
            i7 = i8;
            c0544dz2 = c0544dz3;
            interfaceC1622k02.b(a5);
            c0544dz2.c = a5;
            j4.add(a5);
        }
        return m02;
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int h0(int i4, byte[] bArr, int i5, int i6, C1628n0 c1628n0, C0544dz c0544dz) {
        if ((i4 >>> 3) == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int l02 = l0(bArr, i5, c0544dz);
            c1628n0.c(i4, Long.valueOf(c0544dz.f8530b));
            return l02;
        }
        if (i7 == 1) {
            c1628n0.c(i4, Long.valueOf(n0(i5, bArr)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int i02 = i0(bArr, i5, c0544dz);
            int i8 = c0544dz.f8529a;
            if (i8 < 0) {
                throw M.b();
            }
            if (i8 > bArr.length - i02) {
                throw M.c();
            }
            if (i8 == 0) {
                c1628n0.c(i4, C1638t.f12244q);
            } else {
                c1628n0.c(i4, C1638t.l(bArr, i02, i8));
            }
            return i02 + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new IOException("Protocol message contained an invalid tag (zero).");
            }
            c1628n0.c(i4, Integer.valueOf(d0(i5, bArr)));
            return i5 + 4;
        }
        int i9 = (i4 & (-8)) | 4;
        C1628n0 b4 = C1628n0.b();
        int i10 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int i03 = i0(bArr, i5, c0544dz);
            i10 = c0544dz.f8529a;
            if (i10 == i9) {
                i5 = i03;
                break;
            }
            i5 = h0(i10, bArr, i03, i6, b4, c0544dz);
        }
        if (i5 > i6 || i10 != i9) {
            throw new IOException("Failed to parse the message.");
        }
        c1628n0.c(i4, b4);
        return i5;
    }

    public static int i(Z z4, C0167A c0167a, View view, View view2, AbstractC0178L abstractC0178L, boolean z5) {
        if (abstractC0178L.v() == 0 || z4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return Math.abs(AbstractC0178L.H(view) - AbstractC0178L.H(view2)) + 1;
        }
        return Math.min(c0167a.k(), c0167a.b(view2) - c0167a.e(view));
    }

    public static int i0(byte[] bArr, int i4, C0544dz c0544dz) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return j0(b4, bArr, i5, c0544dz);
        }
        c0544dz.f8529a = b4;
        return i5;
    }

    public static int j(Z z4, C0167A c0167a, View view, View view2, AbstractC0178L abstractC0178L, boolean z5, boolean z6) {
        if (abstractC0178L.v() == 0 || z4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z6 ? Math.max(0, (z4.b() - Math.max(AbstractC0178L.H(view), AbstractC0178L.H(view2))) - 1) : Math.max(0, Math.min(AbstractC0178L.H(view), AbstractC0178L.H(view2)));
        if (z5) {
            return Math.round((max * (Math.abs(c0167a.b(view2) - c0167a.e(view)) / (Math.abs(AbstractC0178L.H(view) - AbstractC0178L.H(view2)) + 1))) + (c0167a.j() - c0167a.e(view)));
        }
        return max;
    }

    public static int j0(int i4, byte[] bArr, int i5, C0544dz c0544dz) {
        byte b4 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i4 & 127;
        if (b4 >= 0) {
            c0544dz.f8529a = i7 | (b4 << 7);
            return i6;
        }
        int i8 = i7 | ((b4 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i6];
        if (b5 >= 0) {
            c0544dz.f8529a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c0544dz.f8529a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c0544dz.f8529a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0544dz.f8529a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int k(Z z4, C0167A c0167a, View view, View view2, AbstractC0178L abstractC0178L, boolean z5) {
        if (abstractC0178L.v() == 0 || z4.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return z4.b();
        }
        return (int) (((c0167a.b(view2) - c0167a.e(view)) / (Math.abs(AbstractC0178L.H(view) - AbstractC0178L.H(view2)) + 1)) * z4.b());
    }

    public static int k0(int i4, byte[] bArr, int i5, int i6, J j4, C0544dz c0544dz) {
        F f4 = (F) j4;
        int i02 = i0(bArr, i5, c0544dz);
        f4.i(c0544dz.f8529a);
        while (i02 < i6) {
            int i03 = i0(bArr, i02, c0544dz);
            if (i4 != c0544dz.f8529a) {
                break;
            }
            i02 = i0(bArr, i03, c0544dz);
            f4.i(c0544dz.f8529a);
        }
        return i02;
    }

    public static boolean l(File file, Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean m4 = m(file, inputStream);
                h(inputStream);
                return m4;
            } catch (Throwable th) {
                th = th;
                h(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static int l0(byte[] bArr, int i4, C0544dz c0544dz) {
        long j4 = bArr[i4];
        int i5 = i4 + 1;
        if (j4 >= 0) {
            c0544dz.f8530b = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            i7 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << i7;
            b4 = bArr[i6];
            i6 = i8;
        }
        c0544dz.f8530b = j5;
        return i6;
    }

    public static boolean m(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    h(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            h(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static int m0(Object obj, InterfaceC1622k0 interfaceC1622k0, byte[] bArr, int i4, int i5, C0544dz c0544dz) {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = j0(i7, bArr, i6, c0544dz);
            i7 = c0544dz.f8529a;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw M.c();
        }
        int i9 = i8 + i7;
        interfaceC1622k0.g(obj, bArr, i8, i9, c0544dz);
        c0544dz.c = obj;
        return i9;
    }

    public static C1814a n(String str, String str2) {
        D3.a aVar = new D3.a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(D3.a.class));
        return new C1814a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C1.g(7, aVar), hashSet3);
    }

    public static long n0(int i4, byte[] bArr) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.gms.internal.play_billing.B] */
    public static B o(int i4) {
        if (i4 != 0 && i4 == 1) {
            return new Object();
        }
        return new Object();
    }

    public static j1.b p(XmlPullParser xmlPullParser) {
        if ("input_selection".equals(xmlPullParser.getName())) {
            int parseInt = Integer.parseInt(xmlPullParser.getAttributeValue(null, "element_id"));
            String attributeValue = xmlPullParser.getAttributeValue(null, "io_id");
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1 && (eventType != 3 || !"input_selection".equals(xmlPullParser.getName()))) {
                eventType = xmlPullParser.next();
            }
            if (attributeValue != null) {
                return new j1.b(0, parseInt, attributeValue);
            }
            throw new RuntimeException("IO Error");
        }
        if (!"output_selection".equals(xmlPullParser.getName())) {
            return null;
        }
        int parseInt2 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "element_id"));
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "io_id");
        int eventType2 = xmlPullParser.getEventType();
        while (eventType2 != 1 && (eventType2 != 3 || !"output_selection".equals(xmlPullParser.getName()))) {
            eventType2 = xmlPullParser.next();
        }
        if (attributeValue2 != null) {
            return new j1.b(1, parseInt2, attributeValue2);
        }
        throw new RuntimeException("IO Error");
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x0914, code lost:
    
        r12.add(new m1.b(r31, r32, r33, r6, r35, r36));
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0960, code lost:
    
        throw new java.lang.RuntimeException("Inner link deserialization error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0437, code lost:
    
        throw new java.io.IOException("Set PLA matrices error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x09d9, code lost:
    
        return new P0.a(r27, r17, r18, r19, r43, r10, r2, r23, r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07e6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static W0.a q(org.xmlpull.v1.XmlPullParser r46) {
        /*
            Method dump skipped, instructions count: 3930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.AbstractC1654b.q(org.xmlpull.v1.XmlPullParser):W0.a");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [H.z, java.lang.Object] */
    public static boolean r(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = A.f779a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0050z.d;
        C0050z c0050z = (C0050z) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        C0050z c0050z2 = c0050z;
        if (c0050z == null) {
            ?? obj = new Object();
            obj.f837a = null;
            obj.f838b = null;
            obj.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            c0050z2 = obj;
        }
        WeakReference weakReference2 = c0050z2.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0050z2.c = new WeakReference(keyEvent);
        if (c0050z2.f838b == null) {
            c0050z2.f838b = new SparseArray();
        }
        SparseArray sparseArray = c0050z2.f838b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(H.InterfaceC0030e r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r7 = r7.b(r10)
            return r7
        L10:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L65
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r8 == 0) goto L65
            boolean r1 = d3.AbstractC1654b.f12604a
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            d3.AbstractC1654b.f12605b = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            d3.AbstractC1654b.f12604a = r3
        L4d:
            java.lang.reflect.Method r1 = d3.AbstractC1654b.f12605b
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L62
            r4[r0] = r10     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L62
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = H.A.b(r7, r10)
            if (r8 == 0) goto L77
            goto L81
        L77:
            if (r7 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7d:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L81:
            return r3
        L82:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = d3.AbstractC1654b.c
            if (r7 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L99
            d3.AbstractC1654b.d = r7     // Catch: java.lang.NoSuchFieldException -> L99
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            d3.AbstractC1654b.c = r3
        L9b:
            java.lang.reflect.Field r7 = d3.AbstractC1654b.d
            if (r7 == 0) goto La6
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r7 = r2
        La7:
            if (r7 == 0) goto Lb4
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = H.A.b(r7, r10)
            if (r8 == 0) goto Lca
            goto Ld4
        Lca:
            if (r7 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Ld0:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld4:
            return r3
        Ld5:
            if (r8 == 0) goto Ldd
            boolean r8 = H.A.b(r8, r10)
            if (r8 != 0) goto Le3
        Ldd:
            boolean r7 = r7.b(r10)
            if (r7 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.AbstractC1654b.s(H.e, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static C1814a t(String str, D3.b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(D3.a.class));
        for (Class cls : new Class[0]) {
            B.g(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        n3.i a4 = n3.i.a(Context.class);
        if (hashSet.contains(a4.f14132a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a4);
        return new C1814a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C0003c(4, str, bVar), hashSet3);
    }

    public static ColorStateList u(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            Object obj = AbstractC1678a.f12977a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i4);
    }

    public static ColorStateList v(Context context, q2.e eVar, int i4) {
        int resourceId;
        TypedArray typedArray = (TypedArray) eVar.f14710q;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0) {
            Object obj = AbstractC1678a.f12977a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return eVar.o(i4);
    }

    public static Drawable w(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable a4;
        return (!typedArray.hasValue(i4) || (resourceId = typedArray.getResourceId(i4, 0)) == 0 || (a4 = AbstractC1678a.a(context, resourceId)) == null) ? typedArray.getDrawable(i4) : a4;
    }

    public static int x(AbstractActivityC1671f abstractActivityC1671f) {
        Integer num = f12608g;
        if (num != null) {
            return num.intValue();
        }
        int i4 = abstractActivityC1671f.getPreferences(0).getInt("rate_power", 0);
        f12608g = Integer.valueOf(i4);
        return i4;
    }

    public static File y(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public int A() {
        return 0;
    }

    public void H(int i4, int i5) {
    }

    public void I() {
    }

    public void J(View view, int i4) {
    }

    public abstract void K(int i4);

    public abstract void L(View view, int i4, int i5);

    public abstract void M(View view, float f4, float f5);

    public abstract void N(y0.g gVar, y0.g gVar2);

    public abstract void O(y0.g gVar, Thread thread);

    public abstract boolean Q(View view, int i4);

    public abstract boolean c(y0.h hVar, y0.c cVar, y0.c cVar2);

    public abstract boolean d(y0.h hVar, Object obj, Object obj2);

    public abstract boolean e(y0.h hVar, y0.g gVar, y0.g gVar2);

    public abstract int f(View view, int i4);

    public abstract int g(View view, int i4);

    public int z(View view) {
        return 0;
    }
}
