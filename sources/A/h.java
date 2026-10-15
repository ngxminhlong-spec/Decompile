package A;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.google.android.gms.internal.play_billing.B;
import d3.AbstractC1654b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z.C2126e;
import z.C2127f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class h extends B {

    /* renamed from: h, reason: collision with root package name */
    public static Class f7h;

    /* renamed from: i, reason: collision with root package name */
    public static Constructor f8i;

    /* renamed from: j, reason: collision with root package name */
    public static Method f9j;

    /* renamed from: k, reason: collision with root package name */
    public static Method f10k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f11l;

    public static boolean j0(Object obj, String str, int i4, boolean z4) {
        k0();
        try {
            try {
                return ((Boolean) f9j.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z4))).booleanValue();
            } catch (InvocationTargetException e4) {
                e = e4;
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InvocationTargetException e5) {
            e = e5;
        }
    }

    public static void k0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f11l) {
            return;
        }
        f11l = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi21Impl", e4.getClass().getName(), e4);
            method = null;
            cls = null;
            method2 = null;
        }
        f8i = constructor;
        f7h = cls;
        f9j = method2;
        f10k = method;
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public Typeface k(Context context, C2126e c2126e, Resources resources, int i4) {
        k0();
        try {
            Object newInstance = f8i.newInstance(null);
            for (C2127f c2127f : c2126e.f15927a) {
                File y = AbstractC1654b.y(context);
                if (y == null) {
                    return null;
                }
                try {
                    if (!AbstractC1654b.l(y, resources, c2127f.f15931f)) {
                        return null;
                    }
                    if (!j0(newInstance, y.getPath(), c2127f.f15929b, c2127f.c)) {
                        return null;
                    }
                    y.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    y.delete();
                }
            }
            k0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f7h, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f10k.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                throw new RuntimeException(e4);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public Typeface l(Context context, E.j[] jVarArr, int i4) {
        File file;
        String readlink;
        if (jVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(v(jVarArr, i4).f696a, "r", null);
                if (openFileDescriptor != null) {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface n4 = n(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return n4;
                        }
                        Typeface n42 = n(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return n42;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                } else if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
