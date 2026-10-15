package W2;

import H.A;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            l lVar = (l) message.obj;
            k kVar = lVar.c;
            kVar.setOnAttachStateChangeListener(new g(lVar));
            if (kVar.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
                if (layoutParams instanceof v.e) {
                    v.e eVar = (v.e) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    D3.d dVar = baseTransientBottomBar$Behavior.f12450h;
                    dVar.getClass();
                    dVar.f677p = lVar.f2053m;
                    baseTransientBottomBar$Behavior.f12281b = new g(lVar);
                    eVar.b(baseTransientBottomBar$Behavior);
                    eVar.f15000g = 80;
                }
                lVar.d();
                kVar.setVisibility(4);
                lVar.f2043a.addView(kVar);
            }
            WeakHashMap weakHashMap = A.f779a;
            if (!kVar.isLaidOut()) {
                kVar.setOnLayoutChangeListener(new e(lVar));
                return true;
            }
            k kVar2 = lVar.c;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = lVar.f2052l.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
                kVar2.post(new d(lVar, 1));
                return true;
            }
            kVar2.setVisibility(0);
            lVar.c();
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        l lVar2 = (l) message.obj;
        int i5 = message.arg1;
        k kVar3 = lVar2.c;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList2 = lVar2.f2052l.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList2 == null || !enabledAccessibilityServiceList2.isEmpty() || kVar3.getVisibility() != 0) {
            lVar2.b();
            return true;
        }
        if (kVar3.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(C2.a.f507a);
            ofFloat.addUpdateListener(new b(lVar2, 0, (byte) 0));
            ofFloat.setDuration(75L);
            ofFloat.addListener(new a(lVar2, i5, 1));
            ofFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        k kVar4 = lVar2.c;
        int height = kVar4.getHeight();
        ViewGroup.LayoutParams layoutParams2 = kVar4.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(C2.a.f508b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new a(lVar2, i5, 3));
        valueAnimator.addUpdateListener(new b(lVar2, 3, (byte) 0));
        valueAnimator.start();
        return true;
    }
}
