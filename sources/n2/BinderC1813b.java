package n2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractC1106r4;
import h2.y;
import java.lang.reflect.Field;
import s2.AbstractBinderC1979a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1813b extends AbstractBinderC1979a implements InterfaceC1812a {

    /* renamed from: p, reason: collision with root package name */
    public final Object f14111p;

    public BinderC1813b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f14111p = obj;
    }

    public static Object C2(InterfaceC1812a interfaceC1812a) {
        if (interfaceC1812a instanceof BinderC1813b) {
            return ((BinderC1813b) interfaceC1812a).f14111p;
        }
        IBinder asBinder = interfaceC1812a.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i4 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i4++;
                field = field2;
            }
        }
        if (i4 != 1) {
            throw new IllegalArgumentException(U.a.i("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        y.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e4) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
        } catch (NullPointerException e5) {
            throw new IllegalArgumentException("Binder object is null.", e5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [n2.a, com.google.android.gms.internal.ads.r4] */
    public static InterfaceC1812a G1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof InterfaceC1812a ? (InterfaceC1812a) queryLocalInterface : new AbstractC1106r4(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }
}
