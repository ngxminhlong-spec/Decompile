package j;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1724f implements MenuItem.OnMenuItemClickListener {
    public static final Class[] c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f13284a;

    /* renamed from: b, reason: collision with root package name */
    public Method f13285b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f13284a;
        Method method = this.f13285b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
