package A;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
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
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import z.C2126e;
import z.C2127f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i extends B {

    /* renamed from: h, reason: collision with root package name */
    public static final Class f12h;

    /* renamed from: i, reason: collision with root package name */
    public static final Constructor f13i;

    /* renamed from: j, reason: collision with root package name */
    public static final Method f14j;

    /* renamed from: k, reason: collision with root package name */
    public static final Method f15k;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi24Impl", e4.getClass().getName(), e4);
            cls = null;
            method = null;
            method2 = null;
        }
        f13i = constructor;
        f12h = cls;
        f14j = method2;
        f15k = method;
    }

    public static boolean j0(Object obj, ByteBuffer byteBuffer, int i4, int i5, boolean z4) {
        try {
            return ((Boolean) f14j.invoke(obj, byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface k0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f12h, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f15k.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final Typeface k(Context context, C2126e c2126e, Resources resources, int i4) {
        Object obj;
        int i5;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f13i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (C2127f c2127f : c2126e.f15927a) {
                int i6 = c2127f.f15931f;
                File y = AbstractC1654b.y(context);
                if (y != null) {
                    try {
                        if (AbstractC1654b.l(y, resources, i6)) {
                            try {
                                fileInputStream = new FileInputStream(y);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i5 = (mappedByteBuffer != null && j0(obj, mappedByteBuffer, c2127f.f15930e, c2127f.f15929b, c2127f.c)) ? i5 + 1 : 0;
                            } finally {
                                break;
                            }
                        }
                    } finally {
                        y.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return k0(obj);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.play_billing.B
    public final Typeface l(Context context, E.j[] jVarArr, int i4) {
        Object obj;
        try {
            obj = f13i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i5 = 0;
            r.i iVar = new r.i(0);
            int length = jVarArr.length;
            while (true) {
                if (i5 < length) {
                    E.j jVar = jVarArr[i5];
                    Uri uri = jVar.f696a;
                    ByteBuffer byteBuffer = (ByteBuffer) iVar.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = AbstractC1654b.G(context, uri);
                        iVar.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !j0(obj, byteBuffer, jVar.f697b, jVar.c, jVar.d)) {
                        break;
                    }
                    i5++;
                } else {
                    Typeface k02 = k0(obj);
                    if (k02 != null) {
                        return Typeface.create(k02, i4);
                    }
                }
            }
        }
        return null;
    }
}
