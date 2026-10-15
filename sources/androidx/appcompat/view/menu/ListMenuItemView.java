package androidx.appcompat.view.menu;

import H.A;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e.AbstractC1657a;
import java.util.WeakHashMap;
import k.InterfaceC1740A;
import k.m;
import k.p;
import q2.e;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1740A, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A, reason: collision with root package name */
    public boolean f2463A;

    /* renamed from: B, reason: collision with root package name */
    public final Drawable f2464B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f2465C;

    /* renamed from: D, reason: collision with root package name */
    public LayoutInflater f2466D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2467E;

    /* renamed from: o, reason: collision with root package name */
    public p f2468o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f2469p;

    /* renamed from: q, reason: collision with root package name */
    public RadioButton f2470q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f2471r;

    /* renamed from: s, reason: collision with root package name */
    public CheckBox f2472s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f2473t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f2474u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f2475v;

    /* renamed from: w, reason: collision with root package name */
    public LinearLayout f2476w;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f2477x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f2478z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e w2 = e.w(getContext(), attributeSet, AbstractC1657a.f12650r, R.attr.listMenuViewStyle);
        this.f2477x = w2.p(5);
        TypedArray typedArray = (TypedArray) w2.f14710q;
        this.y = typedArray.getResourceId(1, -1);
        this.f2463A = typedArray.getBoolean(7, false);
        this.f2478z = context;
        this.f2464B = w2.p(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f2465C = obtainStyledAttributes.hasValue(0);
        w2.y();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f2466D == null) {
            this.f2466D = LayoutInflater.from(getContext());
        }
        return this.f2466D;
    }

    private void setSubMenuArrowVisible(boolean z4) {
        ImageView imageView = this.f2474u;
        if (imageView != null) {
            imageView.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2475v;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2475v.getLayoutParams();
        rect.top = this.f2475v.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // k.InterfaceC1740A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(k.p r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(k.p):void");
    }

    @Override // k.InterfaceC1740A
    public p getItemData() {
        return this.f2468o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap weakHashMap = A.f779a;
        setBackground(this.f2477x);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f2471r = textView;
        int i4 = this.y;
        if (i4 != -1) {
            textView.setTextAppearance(this.f2478z, i4);
        }
        this.f2473t = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f2474u = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2464B);
        }
        this.f2475v = (ImageView) findViewById(R.id.group_divider);
        this.f2476w = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.f2469p != null && this.f2463A) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2469p.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z4) {
        CompoundButton compoundButton;
        View view;
        if (!z4 && this.f2470q == null && this.f2472s == null) {
            return;
        }
        if ((this.f2468o.f13477x & 4) != 0) {
            if (this.f2470q == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2470q = radioButton;
                LinearLayout linearLayout = this.f2476w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2470q;
            view = this.f2472s;
        } else {
            if (this.f2472s == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2472s = checkBox;
                LinearLayout linearLayout2 = this.f2476w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2472s;
            view = this.f2470q;
        }
        if (z4) {
            compoundButton.setChecked(this.f2468o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f2472s;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f2470q;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z4) {
        CompoundButton compoundButton;
        if ((this.f2468o.f13477x & 4) != 0) {
            if (this.f2470q == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f2470q = radioButton;
                LinearLayout linearLayout = this.f2476w;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f2470q;
        } else {
            if (this.f2472s == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f2472s = checkBox;
                LinearLayout linearLayout2 = this.f2476w;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f2472s;
        }
        compoundButton.setChecked(z4);
    }

    public void setForceShowIcon(boolean z4) {
        this.f2467E = z4;
        this.f2463A = z4;
    }

    public void setGroupDividerEnabled(boolean z4) {
        ImageView imageView = this.f2475v;
        if (imageView != null) {
            imageView.setVisibility((this.f2465C || !z4) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f2468o.f13467n;
        boolean z4 = this.f2467E;
        if (z4 || this.f2463A) {
            ImageView imageView = this.f2469p;
            if (imageView == null && drawable == null && !this.f2463A) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f2469p = imageView2;
                LinearLayout linearLayout = this.f2476w;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f2463A) {
                this.f2469p.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f2469p;
            if (!z4) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f2469p.getVisibility() != 0) {
                this.f2469p.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2471r.getVisibility() != 8) {
                this.f2471r.setVisibility(8);
            }
        } else {
            this.f2471r.setText(charSequence);
            if (this.f2471r.getVisibility() != 0) {
                this.f2471r.setVisibility(0);
            }
        }
    }
}
