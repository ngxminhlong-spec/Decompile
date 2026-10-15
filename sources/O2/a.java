package O2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1410a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1411b;

    public a(b bVar) {
        this.f1411b = bVar;
    }

    public a(Drawable.ConstantState constantState) {
        this.f1411b = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f1410a) {
            case 1:
                return ((Drawable.ConstantState) this.f1411b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f1410a) {
            case 0:
                return 0;
            default:
                return ((Drawable.ConstantState) this.f1411b).getChangingConfigurations();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f1410a) {
            case 0:
                return (b) this.f1411b;
            default:
                l0.c cVar = new l0.c(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1411b).newDrawable();
                cVar.f13884o = newDrawable;
                newDrawable.setCallback(cVar.f13882r);
                return cVar;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.f1410a) {
            case 1:
                l0.c cVar = new l0.c(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1411b).newDrawable(resources);
                cVar.f13884o = newDrawable;
                newDrawable.setCallback(cVar.f13882r);
                return cVar;
            default:
                return super.newDrawable(resources);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f1410a) {
            case 1:
                l0.c cVar = new l0.c(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f1411b).newDrawable(resources, theme);
                cVar.f13884o = newDrawable;
                newDrawable.setCallback(cVar.f13882r);
                return cVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
