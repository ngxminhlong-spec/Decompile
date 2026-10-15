package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.duracodefactory.logiccircuitsimulatorpro.R;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1721c extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f13274a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f13275b;
    public LayoutInflater c;
    public Resources d;

    public C1721c(Context context, int i4) {
        super(context);
        this.f13274a = i4;
    }

    public final void a() {
        if (this.f13275b == null) {
            this.f13275b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13275b.setTo(theme);
            }
        }
        this.f13275b.applyStyle(this.f13274a, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13275b;
        if (theme != null) {
            return theme;
        }
        if (this.f13274a == 0) {
            this.f13274a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f13275b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        if (this.f13274a != i4) {
            this.f13274a = i4;
            a();
        }
    }
}
