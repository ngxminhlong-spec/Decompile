package C0;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.work.impl.foreground.SystemForegroundService;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import m2.AbstractC1806a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class O implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f242o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f243p;

    /* renamed from: q, reason: collision with root package name */
    public final int f244q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f245r;

    public /* synthetic */ O(int i4, int i5, Object obj, Object obj2) {
        this.f242o = i5;
        this.f245r = obj;
        this.f244q = i4;
        this.f243p = obj2;
    }

    public O(int i4, Intent intent, q0.g gVar) {
        this.f242o = 3;
        this.f243p = gVar;
        this.f245r = intent;
        this.f244q = i4;
    }

    public O(BottomSheetBehavior bottomSheetBehavior, View view, int i4) {
        this.f242o = 1;
        this.f245r = bottomSheetBehavior;
        this.f243p = view;
        this.f244q = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        switch (this.f242o) {
            case 0:
                View view = (View) this.f243p;
                MainActivity mainActivity = (MainActivity) this.f245r;
                int i5 = this.f244q;
                AbstractC1806a.f14013W = Integer.valueOf(i5);
                switch (i5) {
                    case R.style.AppTheme2 /* 2131820553 */:
                        i4 = 2;
                        break;
                    case R.style.AppTheme3 /* 2131820554 */:
                        i4 = 3;
                        break;
                    case R.style.AppTheme4 /* 2131820555 */:
                        i4 = 4;
                        break;
                    case R.style.AppTheme5 /* 2131820556 */:
                        i4 = 5;
                        break;
                    case R.style.AppTheme6 /* 2131820557 */:
                        i4 = 6;
                        break;
                    case R.style.AppTheme7 /* 2131820558 */:
                        i4 = 7;
                        break;
                    case R.style.AppTheme8 /* 2131820559 */:
                        i4 = 8;
                        break;
                    default:
                        i4 = 1;
                        break;
                }
                SharedPreferences.Editor edit = mainActivity.getPreferences(0).edit();
                edit.putInt("theme", i4);
                edit.apply();
                mainActivity.setTheme(i5);
                mainActivity.recreate();
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                view.startAnimation(alphaAnimation);
                view.postDelayed(new A0.a(11, this), 500L);
                return;
            case 1:
                ((BottomSheetBehavior) this.f245r).B((View) this.f243p, this.f244q);
                return;
            case 2:
                ((androidx.activity.b) this.f245r).a(this.f244q, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f243p));
                return;
            case 3:
                ((q0.g) this.f243p).b((Intent) this.f245r, this.f244q);
                return;
            default:
                ((SystemForegroundService) this.f245r).f3158s.notify(this.f244q, (Notification) this.f243p);
                return;
        }
    }
}
